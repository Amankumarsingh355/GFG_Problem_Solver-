class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        int provinces = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < V; i++) {
            if (visited[i]) continue;
            provinces++;
            visited[i] = true;
            q.clear();
            q.add(i);
            while (!q.isEmpty()) {
                int node = q.poll();
                ArrayList<Integer> neighbors = adj.get(node);
                for (int nei = 0; nei < V; nei++) {
                    if (neighbors.get(nei) == 1 && !visited[nei]) {
                        visited[nei] = true;
                        q.add(nei);
                    }
                }
            }
        }
        return provinces;
    }
}