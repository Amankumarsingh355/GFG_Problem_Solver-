class Solution {
    static boolean isValid(int mat[][]) {
        int row = mat.length;
        int col = mat[0].length;
        int left = 0;
        int right = col-1;
        int top = 0;
        int bottom = row-1;
        for(int block = 0; block < 9; block++) 
        {
            boolean[] visited = new boolean[10];
            int startCol = (block / 3) * 3;
            int startRow = (block % 3) * 3;
            for(int i = startRow; i < startRow + 3; i++) 
            {
                for(int j = startCol; j < startCol + 3; j++) 
                {
                    int num = mat[i][j];
                    if(num != 0 && visited[num]) 
                    {
                        return false;
                    }
                    visited[num] = true;
                }
            }
        }
        while(top <= bottom) 
        {
            boolean[] visited = new boolean[10];
            for(int i = left; i <= right; i++) 
            {
                int num = mat[top][i];
                if(num != 0 && visited[num]) 
                {
                    return false;
                }
                visited[num] = true;
            }
            top++;
        }
        top = 0;
        while(left <= right) 
        {
            boolean[] visited = new boolean[10];
            for(int i = top; i <= bottom; i++) 
            {
                int num = mat[i][left];
                if(num != 0 && visited[num]) 
                {
                    return false;
                }
                visited[num] = true;
            }
            left++;
        }
        return true;
    }
};