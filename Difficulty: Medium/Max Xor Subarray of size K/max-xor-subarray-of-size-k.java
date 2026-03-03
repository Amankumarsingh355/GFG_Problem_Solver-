class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        int ans=0;
        for(int i=0;i<k;i++){
            ans^= arr[i];
        }
        int cx=ans;
        for(int i=k;i<arr.length;i++){
            cx^=arr[i]^arr[i-k];
            ans= Math.max(ans,cx);
        }
        return ans;
    }
}