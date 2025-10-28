class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        int[] indeg = new int[n];

        for (int[] p : prerequisites) {
            int course = p[0], pre = p[1];
            adj.get(pre).add(course);
            indeg[course]++;
        }
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) if (indeg[i] == 0) q.add(i);

        int seen = 0;
        while (!q.isEmpty()) {
            int u = q.remove();
            seen++;
            for (int v : adj.get(u)) {
                indeg[v]--;
                if (indeg[v] == 0) q.add(v);
            }
        }
        return seen == n;
    }
}