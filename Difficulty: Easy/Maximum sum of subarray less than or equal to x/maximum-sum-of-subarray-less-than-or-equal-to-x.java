class Solution {
    public long findMaxSubarraySum(int[] arr, long x) {
        int n = arr.length;
        long maxSum = 0;
        long currSum = 0;
        int left = 0;
        int right = 0;
        while(right < n) {
            currSum += arr[right];
            while(currSum > x) {
                currSum -= arr[left];
                left++;
            }
            maxSum = Math.max(maxSum, currSum);
            right++;
        }
        return maxSum;
    }
}