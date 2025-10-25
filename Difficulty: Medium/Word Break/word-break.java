class Solution {
    int mxLimit;
    public boolean rec(int i, String s,Map<String,Boolean> mp,int[] dp)
    {
        int n = s.length();
        if(i == n)
        return true;
        if(dp[i] != -1){
            return dp[i] == 1 ? true : false;
        }
        for(int j=i; j<=Math.min((i+mxLimit), n); j++){
            String subString = s.substring(i,j);
            if(mp.containsKey(subString)){
                boolean res = rec(j,s,mp,dp);
                dp[i] = res ? 1 : 0;
                if(res)
                return true;
            }
        }
        dp[i] = 0;
        return false;
    }
    public boolean wordBreak(String s, String[] dictionary) {
        mxLimit = 0;
        Map<String,Boolean> mp = new HashMap<>();
        for(String str: dictionary){
            mp.put(str,true);
            mxLimit = Math.max(mxLimit,str.length());
        }
        int[] dp = new int[s.length()+1];
        Arrays.fill(dp,-1);
        return rec(0,s,mp,dp);
    }
}