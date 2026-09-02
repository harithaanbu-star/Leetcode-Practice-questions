import java.util.*;

class Solution {

    public int minMoves(String[] classroom, int energy) {

        int m = classroom.length;
        int n = classroom[0].length();

        char[][] grid = new char[m][n];

        // Convert String[] to char[][]
        for (int i = 0; i < m; i++) {
            grid[i] = classroom[i].toCharArray();
        }

        // Find starting position S
        int sr = 0;
        int sc = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 'S') {
                    sr = i;
                    sc = j;
                }
            }
        }

        // Give every L cell an ID
        int[][] id = new int[m][n];

        for (int[] row : id) {
            Arrays.fill(row, -1);
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 'L') {
                    id[i][j] = count;
                    count++;
                }
            }
        }

        // No dirt to clean
        if (count == 0) {
            return 0;
        }

        // If count Ls exist:
        // 1 << count gives a bit after all Ls
        // subtracting 1 gives all L bits as 1
        int targetMask = (1 << count) - 1;

        /*
            visited[row][col][energy][mask]

            mask tells us which L cells are already cleaned.
        */
        boolean[][][][] visited =
            new boolean[m][n][energy + 1][1 << count];

        /*
            Each state contains:

            [0] row
            [1] column
            [2] current energy
            [3] cleaned L mask
            [4] number of moves
        */
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[] {
            sr,
            sc,
            energy,
            0,
            0
        });

        visited[sr][sc][energy][0] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            int[] cur = q.poll();

            int r = cur[0];
            int c = cur[1];
            int e = cur[2];
            int mask = cur[3];
            int moves = cur[4];

            // All L cells have been cleaned
            if (mask == targetMask) {
                return moves;
            }

            // Try 4 directions
            for (int d = 0; d < 4; d++) {

                int nr = r + dr[d];
                int nc = c + dc[d];

                // Outside grid
                if (nr < 0 || nr >= m ||
                    nc < 0 || nc >= n) {
                    continue;
                }

                // Wall
                if (grid[nr][nc] == 'X') {
                    continue;
                }

                // Moving costs 1 energy
                if (e == 0) {
                    continue;
                }

                int newEnergy = e - 1;

                int newMask = mask;

                // If we reached a dirt cell
                if (grid[nr][nc] == 'L') {

                    int dirtId = id[nr][nc];

                    newMask = mask | (1 << dirtId);
                }

                // Recharge cell
                if (grid[nr][nc] == 'R') {
                    newEnergy = energy;
                }

                // Visit this state only once
                if (!visited[nr][nc][newEnergy][newMask]) {

                    visited[nr][nc][newEnergy][newMask] = true;

                    q.offer(new int[] {
                        nr,
                        nc,
                        newEnergy,
                        newMask,
                        moves + 1
                    });
                }
            }
        }

        // Impossible to clean all L cells
        return -1;
    }
}