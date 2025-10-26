public class Solution {
    public double medianOf2(int[] a, int[] b) {
        int n = (a == null) ? 0 : a.length;
        int m = (b == null) ? 0 : b.length;
        if (n > m) return medianOf2(b, a);
        int lo = 0, hi = n;
        int half = (n + m + 1) / 2;
        while (lo <= hi) {
            int i = (lo + hi) / 2;
            int j = half - i;
            long Aleft = (i == 0) ? Long.MIN_VALUE : a[i - 1];
            long Aright = (i == n) ? Long.MAX_VALUE : a[i];
            long Bleft = (j == 0) ? Long.MIN_VALUE : b[j - 1];
            long Bright = (j == m) ? Long.MAX_VALUE : b[j];
            if (Aleft <= Bright && Bleft <= Aright) {
                if (((n + m) & 1) == 1) {
                    return (double) Math.max(Aleft, Bleft);
                } else {
                    long leftMax = Math.max(Aleft, Bleft);
                    long rightMin = Math.min(Aright, Bright);
                    return (leftMax + rightMin) / 2.0;
                }
            } else if (Aleft > Bright) {
                hi = i - 1;
            } else {
                lo = i + 1;
            }
        }
        return 0.0;
    }
}