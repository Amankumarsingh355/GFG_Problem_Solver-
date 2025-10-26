class Solution {
    public int longestPalinSubseq(String s1) {
       StringBuilder sb = new StringBuilder(s1);
       String s2 = sb.reverse().toString(); // ✅ Correct
        int[][] dp = new int[s1.length()+1][s2.length()+1]; 
        int m = s1.length();
       int n = s2.length();
       for(int i=0;i<=m;i++){
           dp[i][0] = 0;
       }
       for(int j=0;j<=n;j++){
           dp[0][j] = 0;
       }
       for(int i=1;i<=m;i++){
           for(int j=1;j<=n;j++){
                    if(s1.charAt(i-1)==s2.charAt(j-1)){
                        dp[i][j] = 1 + dp[i-1][j-1];
                    }
                    else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                    }
           }
       }
       return dp[m][n];
    }
}