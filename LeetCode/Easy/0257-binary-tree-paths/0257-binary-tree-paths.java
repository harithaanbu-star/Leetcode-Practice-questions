class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        dfs(root, "", ans);

        return ans;
    }

    public void dfs(TreeNode node, String path, List<String> ans) {

        path += node.val;

        // Leaf node
        if (node.left == null && node.right == null) {
            ans.add(path);
            return;
        }

        // Go left
        if (node.left != null) {
            dfs(node.left, path + "->", ans);
        }

        // Go right
        if (node.right != null) {
            dfs(node.right, path + "->", ans);
        }
    }
}