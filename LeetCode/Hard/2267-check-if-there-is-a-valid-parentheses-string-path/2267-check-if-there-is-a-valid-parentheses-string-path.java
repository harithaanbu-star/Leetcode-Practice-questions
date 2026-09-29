class Solution {
    int m, n;
    char[][] grid;
    Boolean[][][] dp;

    public boolean hasValidPath(char[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;

        // A valid parentheses string must have even length
        if ((m + n - 1) % 2 != 0) {
            return false;
        }

        // Start must be '('
        if (grid[0][0] != '(') {
            return false;
        }

        dp = new Boolean[m][n][m + n];

        return dfs(0, 0, 0);
    }

    boolean dfs(int i, int j, int balance) {

        // Update balance for current cell
        if (grid[i][j] == '(') {
            balance++;
        } else {
            balance--;
        }

        // More ')' than '('
        if (balance < 0) {
            return false;
        }

        // Reached destination
        if (i == m - 1 && j == n - 1) {
            return balance == 0;
        }

        // Already calculated
        if (dp[i][j][balance] != null) {
            return dp[i][j][balance];
        }

        boolean result = false;

        // Move down
        if (i + 1 < m) {
            result = dfs(i + 1, j, balance);
        }

        // Move right
        if (!result && j + 1 < n) {
            result = dfs(i, j + 1, balance);
        }

        dp[i][j][balance] = result;

        return result;
    }
}