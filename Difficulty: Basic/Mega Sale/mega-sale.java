class Solution {
    public int maxProfit(int m, int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        if(nums.length<m){
            for(int i = 0;i<nums.length;i++){
                if(nums[i]<0){
                    sum = sum - (nums[i]);
                }
            }
        }
        else{
            for(int j = 0;j<m;j++){
                if(nums[j]<0){
                    sum = sum - (nums[j]);
                }
            }
        }
        return sum;
    }
}