public class Solution {
    public ArrayList<Integer> safeNodes(int V, int[][] edges) {
        List<List<Integer>> rev = new ArrayList<>(V);
        for (int i = 0; i < V; i++) rev.add(new ArrayList<>());
        int[] outDeg = new int[V];
        for (int[] e : edges) {
            int u = e[0], v = e[1];
            rev.get(v).add(u);
            outDeg[u]++;
        }
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < V; i++) if (outDeg[i] == 0) q.add(i);
        boolean[] safe = new boolean[V];
        while (!q.isEmpty()) {
            int node = q.remove();
            safe[node] = true;
            for (int pred : rev.get(node)) {
                outDeg[pred]--;
                if (outDeg[pred] == 0) q.add(pred);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < V; i++) if (safe[i]) result.add(i);
        return result;
    }
}