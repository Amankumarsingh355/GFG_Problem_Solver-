class Solution
{
    public int findMaxArea(int[][] grid)
    {
        // Code 
        int n=grid.length,m=grid[0].length;
        int ans=0;
        boolean v[][]= new boolean[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!v[i][j] && grid[i][j]==1){
                    int min=0;
                    min=dfs(grid, v, i,j,n,m,min);
                    ans=Math.max(min,ans);
                }
                
            }
        }
        return ans;
    }
    public int dfs(int g[][], boolean  v[][], int i, int j, int n, int m, int ans){
        
        if(i<0|| i>=n || j<0 || j>=m || v[i][j]==true || g[i][j]==0)return ans;
        v[i][j]=true;
        ans+=1;
        int rn[]={0,+1,-1,0,+1,+1,-1,-1};
        int cw[]={ +1,0,0,-1,+1,-1,+1,-1};
        for(int o=0;o<rn.length;o++){
            
            ans=dfs(g,v,i+rn[o],j+cw[o],n,m,ans);
        }
        return  ans;
        
    }
    
}