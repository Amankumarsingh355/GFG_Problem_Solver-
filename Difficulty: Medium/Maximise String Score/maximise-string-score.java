public class Solution {
    private int solve(int ind, String s, List<List<Integer>> adj,
                      int[] pref, int[][] nextPos, int[] dp) {
        int n = s.length();
        if (ind == n - 1) return 0;
        if (dp[ind] != -1) return dp[ind];
        int best = 0;
        int curr = s.charAt(ind) - 'a';
        for (int targetChar : adj.get(curr)) {
            int tIdx = targetChar - 'a';
            int jumpInd = nextPos[ind][tIdx];
            if (jumpInd == -1) continue;
            int gain;
            if (targetChar == s.charAt(ind)) {
                gain = pref[jumpInd] - pref[ind + 1];
            } else {
                gain = pref[jumpInd] - pref[ind];
            }
            gain += solve(jumpInd, s, adj, pref, nextPos, dp);
            best = Math.max(best, gain);
        }
        dp[ind] = best;
        return best;
    }
    public int maxScore(String s, char[][] jumps) {
        int n = s.length();
        List<List<Integer>> adj = new ArrayList<>(26);
        for (int i = 0; i < 26; i++) adj.add(new ArrayList<>());
        if (jumps != null) {
            for (char[] p : jumps) {
                if (p == null || p.length < 2) continue;
                char from = p[0];
                char to = p[1];
                adj.get(from - 'a').add((int) to);
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            adj.get(c - 'a').add((int) c);
        }
        int[][] nextPos = new int[n][26];
        for (int i = 0; i < n; i++) Arrays.fill(nextPos[i], -1);
        int[] last = new int[26];
        Arrays.fill(last, -1);
        for (int i = n - 1; i >= 0; i--) {
            for (int c = 0; c < 26; c++) {
                nextPos[i][c] = last[c];
            }
            last[s.charAt(i) - 'a'] = i;
        }
        int[] pref = new int[n + 1];
        for (int i = 0; i < n; i++) pref[i + 1] = pref[i] + s.charAt(i);
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(0, s, adj, pref, nextPos, dp);
    }
    public static void main(String[] args) {
        Solution ob = new Solution();
        String s1 = "forgfg";
        char[][] jumps1 = new char[][]{{'f','r'},{'r','g'}};
        System.out.println(ob.maxScore(s1, jumps1));
        String s2 = "abcda";
        char[][] jumps2 = new char[][]{{'b','d'}};
        System.out.println(ob.maxScore(s2, jumps2));
    }
}