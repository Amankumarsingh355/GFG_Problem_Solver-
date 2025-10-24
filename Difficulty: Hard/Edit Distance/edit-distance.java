public class Solution {
    public int editDistance(String s1, String s2) {
        if (s1 == null) s1 = "";
        if (s2 == null) s2 = "";
        int n = s1.length(), m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) dp[i][0] = i;
        for (int j = 0; j <= m; j++) dp[0][j] = j;
        for (int i = 1; i <= n; i++) {
            char a = s1.charAt(i - 1);
            for (int j = 1; j <= m; j++) {
                char b = s2.charAt(j - 1);
                if (a == b) dp[i][j] = dp[i - 1][j - 1];
                else {
                    int delete = dp[i - 1][j];
                    int insert = dp[i][j - 1];
                    int replace = dp[i - 1][j - 1];
                    dp[i][j] = 1 + Math.min(delete, Math.min(insert, replace));
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        Solution ob = new Solution();
        String s1 = "geek", s2 = "gesek";
        System.out.println(ob.editDistance(s1, s2));
        System.out.println(ob.editDistance("gfg", "gfg"));
        System.out.println(ob.editDistance("abcd", "bcfe"));
    }
}