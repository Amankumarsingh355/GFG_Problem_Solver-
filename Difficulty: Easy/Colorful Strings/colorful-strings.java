class Solution {
    static long possibleStrings(int n, int r, int b, int g) {
    long[]fact=new long[n+1];
    fact[0]=1;
    for(int i=1;i<=n;i++)
    fact[i]=fact[i-1]*i;
    int rem=n-(r+g+b);
    long ans=0;
    for(int i=0;i<=rem;i++)
    for(int j=0;j<=rem;j++){
        if(i+j>rem)break;
        int k=rem-(i+j);
        ans+=fact[n]/(fact[r+i]*fact[g+j]*fact[b+k]);
    }
    return ans;
}
}
