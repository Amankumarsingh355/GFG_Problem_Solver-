class Solution {
    static long solve(int N, int K, ArrayList<Long> GeekNum) {
        if(K == 1) {
            return GeekNum.get(0);
        }
        for(int i=0;i<N-K;++i) {
            long sum = 0;
            for(int j=i;j<K+i;++j) {
                sum += GeekNum.get(j);
            }
            GeekNum.add(sum);
        }
        return GeekNum.get(N-1);
    }
}