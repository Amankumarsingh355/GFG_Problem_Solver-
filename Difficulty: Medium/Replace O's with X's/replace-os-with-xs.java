class Solution{
    static void dfs(int i, int j, char a[][], int n, int m){
        if(i < 0 || i >= n || j < 0 || j >= m || a[i][j] != 'O') return;
        a[i][j] = '#';
        dfs(i-1, j, a, n, m);
        dfs(i+1, j, a, n, m);
        dfs(i, j-1, a, n, m);
        dfs(i, j+1, a, n, m);
    }
    static char[][] fill(char a[][]) {
        int n = a.length;
        if (n == 0) return a;
        int m = a[0].length;
        for(int i = 0; i < n; i++){
            if(a[i][0] == 'O') dfs(i, 0, a, n, m);
            if(a[i][m-1] == 'O') dfs(i, m-1, a, n, m);
        }
        for(int j = 0; j < m; j++){
            if(a[0][j] == 'O') dfs(0, j, a, n, m);
            if(a[n-1][j] == 'O') dfs(n-1, j, a, n, m);
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] == 'O') a[i][j] = 'X';
                else if(a[i][j] == '#') a[i][j] = 'O';
            }
        }
        return a;
    }
}