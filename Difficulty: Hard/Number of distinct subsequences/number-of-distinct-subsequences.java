public class Solution {
    private static final long MOD = 1_000_000_007L;
    public long distinctSubseq(String s) {
        if (s == null) return 0L;
        long[] lastDp = new long[26];
        long dp = 1L; 
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            long newDp = (dp * 2) % MOD;
            newDp = (newDp - lastDp[c] + MOD) % MOD;
            lastDp[c] = dp;
            dp = newDp;
        }
        return dp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null) {
            System.out.println(0);
            return;
        }
        s = s.trim();
        Solution sol = new Solution();
        long ans = sol.distinctSubseq(s);
        System.out.println(ans);
    }
}