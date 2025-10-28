class Solution {
    int res;
    public int solve(int curr , boolean vis[] , List<List<Integer>> graph){
        vis[curr] = true;
        int a = 0;
        int b = 0;
        for(int next : graph.get(curr)){
            if(!vis[next]){
                int dis = solve(next , vis , graph);
                if(dis > a){
                    b = a;
                    a = dis;
                }
                else if(dis > b) b = dis;
            }
        }
        res = Math.max(a + b + 1 , res);
        return 1 + Math.max(a , b);
    }
    public int diameter(int V, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        res = Integer.MIN_VALUE;
        boolean vis[] = new boolean[V];
        solve(0 , vis , graph);
        return res-1;
    }
}