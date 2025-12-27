class Solution
{
    static long performOperation(long N){
        int p=0;
        long l=0l;
        long n=N;
        while(N!=0){
            long rem=N%10;
            if(rem==5){
                l=6l*(long)Math.pow(10,p)+l;
                p++;
            }else if(rem==6){
                l=5l*(long)Math.pow(10,p)+l;
                p++;
            }else{
                l=rem*(long)Math.pow(10,p)+l;
                p++;
            }
            N/=10;
        }
        return n+l;
    }
}