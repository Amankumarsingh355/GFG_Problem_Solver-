class Solution {
    public long leftCandies(long n, long m) {
        long mod = m % (n*(n+1)/2);
        long root = (long)(-1 + Math.sqrt(1 + 8*mod))/2;
        return mod - root * (root+1)/2;
    }
}