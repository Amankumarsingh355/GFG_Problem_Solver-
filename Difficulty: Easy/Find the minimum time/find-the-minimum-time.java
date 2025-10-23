public class Solution {
    public long minTime(int S1, int S2, int N) {
        long s1 = S1;
        long s2 = S2;
        long n = N;
        long lo = 0;
        long hi = Math.min(s1, s2) * n;
        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            long scanned = mid / s1 + mid / s2;
            if (scanned >= n) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.minTime(2, 4, 2)); 
        System.out.println(sol.minTime(1, 3, 2));
        System.out.println(sol.minTime(3, 5, 5));
    }
}