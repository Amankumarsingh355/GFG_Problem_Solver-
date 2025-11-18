public class Solution {
    public int minimumEffortPath(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int low = 0, high = 1_000_000, ans = 0;
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canReach(mat, n, m, mid, dirs)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public int minCostPath(int[][] mat) {
        return minimumEffortPath(mat);
    }
    private boolean canReach(int[][] mat, int n, int m, int maxDiff, int[][] dirs) {
        boolean[][] visited = new boolean[n][m];
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0});
        visited[0][0] = true;
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int x = cell[0], y = cell[1];
            if (x == n - 1 && y == m - 1) return true;
            for (int[] d : dirs) {
                int nx = x + d[0], ny = y + d[1];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny]) {
                    if (Math.abs(mat[nx][ny] - mat[x][y]) <= maxDiff) {
                        visited[nx][ny] = true;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Solution ob = new Solution();
        int[][] mat1 = {
            {7, 2, 6, 5},
            {3, 1, 10, 8}
        };
        System.out.println(ob.minCostPath(mat1));
        int[][] mat2 = {
            {2, 2, 2, 1},
            {8, 1, 2, 7},
            {2, 2, 2, 8},
            {2, 1, 4, 7},
            {2, 2, 2, 2}
        };
        System.out.println(ob.minCostPath(mat2));
    }
}