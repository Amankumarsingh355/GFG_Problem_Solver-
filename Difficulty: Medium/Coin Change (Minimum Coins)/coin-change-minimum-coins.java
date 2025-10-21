class Solution {
    public int minCoins(int[] coins, int sum) {
        int MAX = sum + 1;
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, MAX);
        dp[0] = 0;
        for (int i = 1; i <= sum; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[sum] == MAX ? -1 : dp[sum];
    }
}