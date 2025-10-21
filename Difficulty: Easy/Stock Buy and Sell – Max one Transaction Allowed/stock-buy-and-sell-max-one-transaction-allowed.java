public class Solution {
    public int maximumProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int p : prices) {
            if (p < minPrice) minPrice = p;
            else maxProfit = Math.max(maxProfit, p - minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] prices1 = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(obj.maximumProfit(prices1));
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(obj.maximumProfit(prices2));
        int[] prices3 = {1, 3, 6, 9, 11};
        System.out.println(obj.maximumProfit(prices3));
    }
}