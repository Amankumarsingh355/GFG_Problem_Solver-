class Solution {
    int thirdLargest(int nums[]) {
        int max = 0;
        if(nums.length == 1 || nums.length == 2){
            return -1;
        }
        else{
            Arrays.sort(nums);
            max = nums[nums.length -3];
        }
        return max;
    }
}