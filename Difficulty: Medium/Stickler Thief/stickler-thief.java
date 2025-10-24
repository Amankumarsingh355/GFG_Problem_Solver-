public class Solution {
    public long findMaxSum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        long prev2 = 0;
        long prev1 = 0;
        for (int x : arr) {
            long pick = prev2 + x;
            long skip = prev1;
            long cur = Math.max(pick, skip);
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int[] arr1 = {6, 5, 5, 7, 4};
        System.out.println(new Solution().findMaxSum(arr1));
        int[] arr2 = {1, 5, 3};
        System.out.println(new Solution().findMaxSum(arr2));
        int[] arr3 = {4, 4, 4, 4};
        System.out.println(new Solution().findMaxSum(arr3));
        int[] arr4 = {};
        System.out.println(new Solution().findMaxSum(arr4));
    }
}