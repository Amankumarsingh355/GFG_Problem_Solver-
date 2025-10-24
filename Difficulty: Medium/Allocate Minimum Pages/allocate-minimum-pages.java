public class Solution {
    public int findPages(int[] arr, int k) {
        if (arr == null) return -1;
        int n = arr.length;
        if (k > n) return -1;
        long lo = 0; 
        long hi = 0;
        for (int x : arr) {
            lo = Math.max(lo, x);
            hi += x;
        }
        long ans = -1;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (canAllocate(arr, k, mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return (int) ans;
    }
    private boolean canAllocate(int[] arr, int k, long maxPages) {
        int students = 1;
        long currentSum = 0;
        for (int x : arr) {
            if (currentSum + x <= maxPages) {
                currentSum += x;
            } else {
                students++;
                currentSum = x;
                if (students > k) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a1 = {12, 34, 67, 90};
        System.out.println(s.findPages(a1, 2));
        int[] a2 = {15, 17, 20};
        System.out.println(s.findPages(a2, 5));
        int[] a3 = {10, 20, 30};
        System.out.println(s.findPages(a3, 3));
    }
}