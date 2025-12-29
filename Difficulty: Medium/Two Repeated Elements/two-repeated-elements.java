class Solution {
    public int[] twoRepeated(int[] nums) {
       int[] arr = new int[2];
       int j = 0;
       HashSet<Integer>set = new HashSet<>();
       for(int i = 0;i<nums.length;i++){
           if(set.contains(nums[i])){
               arr[j++] = nums[i];
           }
           else{
               set.add(nums[i]);
           }
       }
       
       return arr;
        
    }
}