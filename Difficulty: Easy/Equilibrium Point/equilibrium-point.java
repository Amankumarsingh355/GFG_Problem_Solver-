public class Solution {
    // Method name expected by the driver: findEquilibrium
    // Returns first equilibrium index (0-based) or -1 if none
    public int findEquilibrium(int[] arr) {
        if (arr == null || arr.length < 3) return -1;
        long total = 0;
        for (int v : arr) total += v;
        long left = 0;
        for (int i = 0; i < arr.length; ++i) {
            total -= arr[i];               // total is now sum to the right of i
            if (left == total) return i;
            left += arr[i];
        }
        return -1;
    }
}