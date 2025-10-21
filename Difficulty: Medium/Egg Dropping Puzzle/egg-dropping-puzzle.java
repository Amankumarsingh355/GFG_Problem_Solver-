public class Solution {
    public int eggDrop(int n, int k) {
        if (k == 0) return 0;
        if (n == 1) return k;
        long[] dp = new long[n + 1];
        int moves = 0;
        while (dp[n] < k) {
            moves++;
            for (int e = n; e >= 1; e--) {
                dp[e] = dp[e] + dp[e - 1] + 1;
            }
        }
        return moves;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.eggDrop(2, 36)); 
        System.out.println(s.eggDrop(1, 36));
        System.out.println(s.eggDrop(3, 14));
    }
}