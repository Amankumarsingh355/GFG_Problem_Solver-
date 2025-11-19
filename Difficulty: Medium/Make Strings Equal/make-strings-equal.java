public class Solution {
    private static final int K = 26;
    private static final long INF = (1L << 60);
    public long minCost(String s, String t, char[][] transform, int[] cost) {
        if (s.length() != t.length()) return -1L;
        long[][] dist = new long[K][K];
        for (int i = 0; i < K; ++i) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }
        for (int i = 0; i < transform.length; ++i) {
            char from = transform[i][0];
            char to = transform[i][1];
            int c = cost[i];
            int u = from - 'a';
            int v = to - 'a';
            if (c < dist[u][v]) dist[u][v] = c;
        }
        for (int k = 0; k < K; ++k) {
            for (int i = 0; i < K; ++i) {
                if (dist[i][k] == INF) continue;
                for (int j = 0; j < K; ++j) {
                    if (dist[k][j] == INF) continue;
                    long nd = dist[i][k] + dist[k][j];
                    if (nd < dist[i][j]) dist[i][j] = nd;
                }
            }
        }
        long total = 0L;
        for (int i = 0; i < s.length(); ++i) {
            int a = s.charAt(i) - 'a';
            int b = t.charAt(i) - 'a';
            long best = INF;
            for (int c = 0; c < K; ++c) {
                if (dist[a][c] < INF && dist[b][c] < INF) {
                    long cand = dist[a][c] + dist[b][c];
                    if (cand < best) best = cand;
                }
            }
            if (best == INF) return -1L;
            total += best;
        }
        return total;
    }
}