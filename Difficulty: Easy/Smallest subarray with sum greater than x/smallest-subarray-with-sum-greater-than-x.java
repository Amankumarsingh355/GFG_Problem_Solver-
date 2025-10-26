class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        while(right < n) {
            sum += arr[right];
            while(sum > x) {
                int len = right-left+1;
                minLen = Math.min(minLen,len);
                sum -= arr[left];
                left++;
            }
            right++;
        }
        if(minLen == Integer.MAX_VALUE) return 0;
        return minLen;
    }
}