import java.util.*;

class Solution {

    static class State {
        long score;
        int[] indices;

        State(long score, int[] indices) {
            this.score = score;
            this.indices = indices;
        }
    }

    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();

        // start, end, weight, original index
        int[][] a = new int[n][4];

        for (int i = 0; i < n; i++) {
            a[i][0] = intervals.get(i).get(0);
            a[i][1] = intervals.get(i).get(1);
            a[i][2] = intervals.get(i).get(2);
            a[i][3] = i;
        }

        // Sort by start time
        Arrays.sort(a, (x, y) -> {
            if (x[0] != y[0])
                return Integer.compare(x[0], y[0]);
            if (x[1] != y[1])
                return Integer.compare(x[1], y[1]);
            return Integer.compare(x[3], y[3]);
        });

        // Find next non-overlapping interval
        int[] next = new int[n];

        for (int i = 0; i < n; i++) {
            int lo = i + 1;
            int hi = n;

            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;

                if (a[mid][0] > a[i][1]) {
                    hi = mid;
                } else {
                    lo = mid + 1;
                }
            }

            next[i] = lo;
        }

        /*
         * dp[i][k]:
         * Best result starting from interval i
         * when we can still choose at most k intervals.
         */
        State[][] dp = new State[n + 1][5];

        for (int k = 0; k <= 4; k++) {
            dp[n][k] = new State(0, new int[0]);
        }

        for (int i = n - 1; i >= 0; i--) {

            dp[i][0] = new State(0, new int[0]);

            for (int k = 1; k <= 4; k++) {

                // Don't take interval i
                State skip = dp[i + 1][k];

                // Take interval i
                State nextState = dp[next[i]][k - 1];

                int[] takeIndices =
                        new int[nextState.indices.length + 1];

                takeIndices[0] = a[i][3];

                System.arraycopy(
                        nextState.indices,
                        0,
                        takeIndices,
                        1,
                        nextState.indices.length
                );

                // Sort original indices for lexicographical comparison
                Arrays.sort(takeIndices);

                State take = new State(
                        (long) a[i][2] + nextState.score,
                        takeIndices
                );

                dp[i][k] = better(take, skip);
            }
        }

        return dp[0][4].indices;
    }

    /*
     * Return the better state:
     *
     * 1. Higher total weight
     * 2. If weight is equal, lexicographically smaller indices
     */
    private State better(State a, State b) {

        if (a.score != b.score) {
            return a.score > b.score ? a : b;
        }

        int[] x = a.indices;
        int[] y = b.indices;

        int len = Math.min(x.length, y.length);

        for (int i = 0; i < len; i++) {
            if (x[i] != y[i]) {
                return x[i] < y[i] ? a : b;
            }
        }

        // If one is a prefix of the other,
        // the shorter one is lexicographically smaller.
        return x.length <= y.length ? a : b;
    }
}