class Solution {
    public int subseqCount(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        int[] dp=new int[n+1]; 
        dp[0]=1;
        for(int i=1;i<m+1;i++){
            for(int j=n;j>=1;j--){
                if(s1.charAt(i-1)==s2.charAt(j-1))dp[j]=dp[j]+dp[j-1];
            }
        }
        return dp[n];
    }
}