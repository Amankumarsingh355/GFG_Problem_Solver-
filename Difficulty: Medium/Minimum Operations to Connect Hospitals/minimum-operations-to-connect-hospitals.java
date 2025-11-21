public class Solution {
    public int minConnect(int V, int[][] edges) {
        if (V <= 1) return 0;
        if (edges == null) edges = new int[0][0];
        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            if (e == null || e.length < 2) continue;
            int u = e[0], v = e[1];
            if (u < 0 || u >= V || v < 0 || v >= V) continue;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[V];
        int components = 0;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                components++;
                Deque<Integer> stack = new ArrayDeque<>();
                stack.push(i);
                visited[i] = true;
                while (!stack.isEmpty()) {
                    int node = stack.pop();
                    for (int nei : adj.get(node)) {
                        if (!visited[nei]) {
                            visited[nei] = true;
                            stack.push(nei);
                        }
                    }
                }
            }
        }
        int E = edges.length;
        int edgesNeededForForest = V - components;
        int redundant = E - edgesNeededForForest;
        int needed = components - 1;
        return redundant >= needed ? needed : -1;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int V1 = 4;
        int[][] edges1 = {{0,1},{0,2},{1,2}};
        System.out.println(obj.minConnect(V1, edges1));
        int V2 = 5;
        int[][] edges2 = {{0,1},{0,2},{2,3},{3,4}};
        System.out.println(obj.minConnect(V2, edges2));
        int V3 = 4;
        int[][] edges3 = {{0,1}};
        System.out.println(obj.minConnect(V3, edges3));
    }
}