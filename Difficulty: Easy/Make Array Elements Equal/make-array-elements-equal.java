class Solution {
    public long minOperations(int N) {
        long n = (long)N;
        return (n%2 == 0) ? (n*n/4) : ((n*n -1)/4) ;
    }
}