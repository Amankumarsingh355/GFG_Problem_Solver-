class Solution {
int minSteps(String S) {
int dp[] = new int[S.length()+1];
dp[0] = 0;
for(int i=1;i<=S.length();i++)
{
int m = Integer.MAX_VALUE;
for(int j=i-1;j>=0;j--)
{
if(S.substring(j,i).equals(S.substring(0,j)))
{
m = Math.min(m,dp[j]+1);
}
}
if(m==Integer.MAX_VALUE)
{
dp[i]=dp[i-1]+1;
}
else
{
dp[i] = m;
}
}
return dp[S.length()];
}

}