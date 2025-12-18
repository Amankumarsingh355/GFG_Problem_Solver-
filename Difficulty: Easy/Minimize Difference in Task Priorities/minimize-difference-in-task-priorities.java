class Solution {
    int minDiff(int[] arr, int k, int m, int t) {
        Arrays.sort(arr);  
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (arr[i] >= t) count++;
        }
        if (count >= m) {
            minDiff = arr[k - 1] - arr[0];
        }
        for (int i = 1; i <= n - k; i++) {
            if (arr[i - 1] >= t) count--;
            if (arr[i + k - 1] >= t) count++;
            if (count >= m) {
                int diff = arr[i + k - 1] - arr[i];
                minDiff = Math.min(minDiff, diff);
            }
        }
        return (minDiff == Integer.MAX_VALUE) ? -1 : minDiff;
    }
}