class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            adj.get(u).add(v);
        }
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, visited, recStack, adj)) return true;
            }
        }
        return false;
    }
    private boolean dfs(int node, boolean[] visited, boolean[] recStack,
                        ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        recStack[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, visited, recStack, adj)) return true;
            } else if (recStack[neighbor]) {
                return true;
            }
        }
        recStack[node] = false;
        return false;
    }
}