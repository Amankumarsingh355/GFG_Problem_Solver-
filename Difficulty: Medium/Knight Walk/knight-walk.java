class Solution {
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N) {
        if(KnightPos[0] == TargetPos[0] && KnightPos[1] == TargetPos[1]) return 0;
        int[] x = {2,2,-2,-2,1,1,-1,-1};
        int[] y = {1,-1,1,-1,2,-2,2,-2};
        Queue<int[]> q = new LinkedList<>();
        int[][] visited = new int[N][N];
        q.offer(new int[]{KnightPos[0]-1, KnightPos[1]-1,0});
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                int[] cor = q.poll();
                int n = cor[0];
                int m = cor[1];
                int steps = cor[2];
                for(int k =0;k<8;k++)
                {
                    int dx = n+x[k];
                    int dy = m+y[k];
                    if(dx>=0 && dx<N && dy>=0 && dy<N && visited[dx][dy] ==0)
                    {
                        if(dx == TargetPos[0]-1 && dy == TargetPos[1]-1) return steps+1;
                        visited[dx][dy] = 1;
                        q.offer(new int[]{dx, dy, steps+1});
                    }
                }
            }
        }
        return -1;
    }
}