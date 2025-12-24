class Solution {
    int replaceBit(int N, int K) {
        String binary = Integer.toBinaryString(N);
        int n = binary.length();
        int x = n-K;
        if(x<0 || x>=32) return N;
        return N & (~(1<<x));
    }
}