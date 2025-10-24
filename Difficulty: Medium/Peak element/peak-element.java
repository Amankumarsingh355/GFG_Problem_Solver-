class Solution {
    public int peakElement(int[] arr) {
        int n = arr.length;
        if (n == 1) return 0;
        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] < arr[mid + 1]) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}