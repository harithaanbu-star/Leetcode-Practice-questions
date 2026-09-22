import java.util.*;

class Solution {

    class Node {
        int prod;
        int[] cnt;

        Node(int k) {
            cnt = new int[k];
            prod = 1 % k;
        }
    }

    int k;
    Node[] tree;

    // Merge two nodes
    Node merge(Node left, Node right) {

        Node res = new Node(k);

        // Product of the complete segment
        res.prod = (left.prod * right.prod) % k;

        // Prefixes completely inside left
        for (int i = 0; i < k; i++) {
            res.cnt[i] += left.cnt[i];
        }

        // Prefixes which start in left and continue into right
        for (int r = 0; r < k; r++) {
            int newRem = (left.prod * r) % k;
            res.cnt[newRem] += right.cnt[r];
        }

        return res;
    }

    // Build segment tree
    void build(int node, int start, int end, int[] nums) {

        if (start == end) {

            tree[node] = new Node(k);

            int rem = nums[start] % k;

            tree[node].prod = rem;
            tree[node].cnt[rem] = 1;

            return;
        }

        int mid = start + (end - start) / 2;

        build(node * 2, start, mid, nums);
        build(node * 2 + 1, mid + 1, end, nums);

        tree[node] = merge(tree[node * 2],
                           tree[node * 2 + 1]);
    }

    // Point update
    void update(int node, int start, int end,
                int index, int value) {

        if (start == end) {

            int rem = value % k;

            tree[node] = new Node(k);
            tree[node].prod = rem;
            tree[node].cnt[rem] = 1;

            return;
        }

        int mid = start + (end - start) / 2;

        if (index <= mid) {
            update(node * 2, start, mid, index, value);
        } else {
            update(node * 2 + 1, mid + 1, end, index, value);
        }

        tree[node] = merge(tree[node * 2],
                           tree[node * 2 + 1]);
    }

    // Range query [l, r]
    Node query(int node, int start, int end,
               int l, int r) {

        // Completely inside
        if (l <= start && end <= r) {
            return tree[node];
        }

        int mid = start + (end - start) / 2;

        // Completely in left
        if (r <= mid) {
            return query(node * 2,
                         start,
                         mid,
                         l,
                         r);
        }

        // Completely in right
        if (l > mid) {
            return query(node * 2 + 1,
                         mid + 1,
                         end,
                         l,
                         r);
        }

        // Overlapping both sides
        Node left = query(node * 2,
                          start,
                          mid,
                          l,
                          r);

        Node right = query(node * 2 + 1,
                           mid + 1,
                           end,
                           l,
                           r);

        return merge(left, right);
    }

    public int[] resultArray(int[] nums,
                             int k,
                             int[][] queries) {

        this.k = k;

        int n = nums.length;

        tree = new Node[4 * n];

        // Build tree
        build(1, 0, n - 1, nums);

        int[] ans = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {

            int index = queries[q][0];
            int value = queries[q][1];
            int start = queries[q][2];
            int x = queries[q][3];

            // 1. Permanently update nums[index]
            update(1, 0, n - 1, index, value);

            // 2. Query nums[start ... n-1]
            Node res = query(1, 0, n - 1,
                             start, n - 1);

            // 3. Number of prefixes with product % k == x
            ans[q] = res.cnt[x];
        }

        return ans;
    }
}