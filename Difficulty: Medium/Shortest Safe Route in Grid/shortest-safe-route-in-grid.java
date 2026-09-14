class Solution {
    public static int shortestPath(int[][] mat) {
        int n = mat.length;
        if (n == 0) return -1;
        int m = mat[0].length;
        boolean[][] isSafe = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(isSafe[i], true);
        }
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    isSafe[i][j] = false;
                    for (int k = 0; k < 4; k++) {
                        int ni = i + dx[k];
                        int nj = j + dy[k];
                        if (ni >= 0 && ni < n && nj >= 0 && nj < m) {
                            isSafe[ni][nj] = false;
                        }
                    }
                }
            }
        }
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            if (isSafe[i][0]) {
                queue.add(new int[]{i, 0, 1}); // {row, col, distance}
                visited[i][0] = true;
            }
        }
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            int dist = current[2];
            if (c == m - 1) {
                return dist;
            }
            for (int k = 0; k < 4; k++) {
                int nr = r + dx[k];
                int nc = c + dy[k];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && isSafe[nr][nc] && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    queue.add(new int[]{nr, nc, dist + 1});
                }
            }
        }
        return -1;
    }
}