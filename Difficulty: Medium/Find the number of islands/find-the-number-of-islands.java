public class Solution {
    private static final int[] DR = {-1,-1,-1,0,0,1,1,1};
    private static final int[] DC = {-1,0,1,-1,1,-1,0,1};

    public int countIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int n = grid.length, m = grid[0].length;
        int count = 0;
        Deque<int[]> stack = new ArrayDeque<>();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (grid[r][c] != 'L') continue;
                count++;
                stack.clear();
                stack.push(new int[]{r, c});
                grid[r][c] = 'W';
                while (!stack.isEmpty()) {
                    int[] cur = stack.pop();
                    int cr = cur[0], cc = cur[1];
                    for (int d = 0; d < 8; d++) {
                        int nr = cr + DR[d];
                        int nc = cc + DC[d];
                        if (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 'L') {
                            grid[nr][nc] = 'W';
                            stack.push(new int[]{nr, nc});
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        char[][] g1 = {
            {'L','L','W','W','W'},
            {'W','L','W','W','L'},
            {'L','W','W','L','L'},
            {'W','W','W','W','W'},
            {'L','W','L','L','W'}
        };
        System.out.println(s.countIslands(g1));

        char[][] g2 = {
            {'W','L','L','L','W','W','W'},
            {'W','W','L','L','W','L','W'}
        };
        System.out.println(s.countIslands(g2));
    }
}