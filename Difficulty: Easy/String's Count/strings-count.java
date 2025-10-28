class Solution 
{ 
    static long countStr(long n)
    {
        long p = (long)Math.pow(n,3);
        return (p+3*n+2)/2;
    }
}