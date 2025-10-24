public class Solution {
    public int maxProduct(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int maxProd = arr[0];
        int minProd = arr[0];
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            if (x < 0) {
                int tmp = maxProd;
                maxProd = minProd;
                minProd = tmp;
            }
            maxProd = Math.max(x, maxProd * x);
            minProd = Math.min(x, minProd * x);
            ans = Math.max(ans, maxProd);
        }
        return ans;
    }
    public int maxProductSubarray(int[] arr) {
        return maxProduct(arr);
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxProduct(new int[]{-2, 6, -3, -10, 0, 2}));
        System.out.println(s.maxProduct(new int[]{-1, -3, -10, 0, 6}));
        System.out.println(s.maxProduct(new int[]{2, 3, 4}));
    }
}