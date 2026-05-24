class Solution {
    public int coin(int[] arr) {
        // code here
        int minVal = Integer.MAX_VALUE;
        for(int val : arr){
            minVal = Math.min(minVal , val);
        }
        return minVal;
    }
}