import java.util.*;
class Solution {
    private static boolean canPaintInTime(int[] arr, int k, long limit) {
        int painters = 1;
        long cur = 0L;
        for (int x : arr) {
            if (x > limit) return false;
            if (cur + x <= limit) {
                cur += x;
            } else {
                painters++;
                if (painters > k) return false;
                cur = x;
            }
        }
        return true;
    }
    public static long minTime(int[] arr, int k) {
        if (arr == null || arr.length == 0) return 0L;
        long sum = 0L;
        int max = 0;
        for (int x : arr) {
            sum += x;
            if (x > max) max = x;
        }
        long low = max;
        long high = sum;
        long ans = high;
        while (low <= high) {
            long mid = low + ((high - low) >>> 1);
            if (canPaintInTime(arr, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(minTime(new int[]{5, 10, 30, 20, 15}, 3));
        System.out.println(minTime(new int[]{10, 20, 30, 40}, 2));
        System.out.println(minTime(new int[]{100, 200, 300, 400}, 1));
    }
}