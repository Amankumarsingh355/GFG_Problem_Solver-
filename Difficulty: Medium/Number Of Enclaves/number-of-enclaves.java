class Solution {

    int numberOfEnclaves(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int j=0; j<c; j++) {
            if(grid[0][j] == 1) {
                q.add(new int[]{0,j});
                grid[0][j] = 0;
            }
            if(grid[r-1][j] == 1) {
                q.add(new int[]{r-1,j});
                grid[r-1][j] = 0;
            }
        }
        for(int i=0; i<r; i++) {
            if(grid[i][0] == 1) {
                q.add(new int[]{i,0});
                grid[i][0] = 0;
            }
            if(grid[i][c-1] == 1) {
                q.add(new int[]{i,c-1});
                grid[i][c-1] = 0;
            }
        }
        int[][] moves = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()) {
            int[] cell = q.remove();
            int i = cell[0], j = cell[1];
            for(int[] move : moves) {
                int row = i + move[0];
                int col = j + move[1];
                if(row>=0 && row<r && col>=0 && col<c && grid[row][col] == 1) {
                    q.add(new int[]{row,col});
                    grid[row][col] = 0;
                }
            }
        }
        int count = 0;
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                count += grid[i][j];
            }
        }
        return count;
    }
}