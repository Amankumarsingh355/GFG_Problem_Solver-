class Solution
{
    public int isReversible(String str, int n) 
    { 
        int v=0;
        n=n-1;
        while(v<=n){
            if(str.charAt(v)!=str.charAt(n)){
                return 0;
            }
            v++;
            n--;
        }
        return 1;
    } 
}