class Solution {
    public int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0]; 
        for (int i = 1; i < n; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
