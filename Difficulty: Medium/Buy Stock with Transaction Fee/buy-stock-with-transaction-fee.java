class Solution {
    public int maxProfit(int prices[], int k) {
        int n=prices.length;
        int profit=0;
        int aheadNotBuy=0,aheadBuy=0;
        int currNotBuy=0,currBuy=0;
        for(int ind=n-1;ind>=0;ind--){
            currNotBuy=Math.max(prices[ind]-k+aheadBuy,aheadNotBuy);
            currBuy=Math.max(-prices[ind]+aheadNotBuy,aheadBuy);
            aheadBuy=currBuy;
            aheadNotBuy=currNotBuy;
        }
        return aheadBuy;
    }
}