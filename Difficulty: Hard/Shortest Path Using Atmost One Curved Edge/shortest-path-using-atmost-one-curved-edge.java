import java.util.*;
public class Solution {
    static final long INF = Long.MAX_VALUE / 4;
    public int shortestPath(int V, int a, int b, int[][] edges) {
        if (V <= 0) return -1;
        int nodes = 2 * V;
        @SuppressWarnings("unchecked")
        ArrayList<int[]>[] adj = new ArrayList[nodes];
        for (int i = 0; i < nodes; ++i) adj[i] = new ArrayList<>();
        for (int[] e : edges) {
            int x = e[0], y = e[1], w1 = e[2], w2 = e[3];
            int x0 = x, y0 = y;
            int x1 = x + V, y1 = y + V;
            adj[x0].add(new int[]{y0, w1});
            adj[y0].add(new int[]{x0, w1});
            adj[x1].add(new int[]{y1, w1});
            adj[y1].add(new int[]{x1, w1});
            adj[x0].add(new int[]{y1, w2});
            adj[y0].add(new int[]{x1, w2});
        }
        long[] dist = new long[nodes];
        Arrays.fill(dist, INF);
        boolean[] seen = new boolean[nodes];
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a2 -> a2[0]));
        if (a < 0 || a >= V || b < 0 || b >= V) return -1;
        dist[a] = 0L;
        pq.add(new long[]{0L, a});
        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long d = cur[0];
            int u = (int) cur[1];
            if (seen[u]) continue;
            seen[u] = true;
            if (d > dist[u]) continue;
            for (int[] edge : adj[u]) {
                int v = edge[0];
                int w = edge[1];
                long nd = d + (long) w;
                if (nd < dist[v]) {
                    dist[v] = nd;
                    pq.add(new long[]{nd, v});
                }
            }
        }
        long ans = Math.min(dist[b], dist[b + V]);
        if (ans >= INF / 2) return -1;
        return (int) ans;
    }
}