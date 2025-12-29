class Solution {
    public int maxSum(int arr[]) {
        int n = arr.length;
        int cook=0;
        for(int i=0;i<n-1;i++){
            int pairsum =arr[i]+arr[i+1];
            cook = Math.max(cook,pairsum);
        }
        return cook;
    }
}