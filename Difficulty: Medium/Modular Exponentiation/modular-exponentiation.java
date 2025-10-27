class Solution {
    public int powMod(int x, int n, int M) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        x = x % M;

        while (n > 0) {
            if ((n & 1) == 1) {
                result = (int)(((long)result * x) % M);
            }
            x = (int)(((long)x * x) % M);
            n >>= 1;
        }
        return result;
    }

}