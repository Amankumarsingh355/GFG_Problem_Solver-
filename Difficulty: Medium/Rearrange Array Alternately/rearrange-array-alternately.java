class Solution {
    public void rearrange(int nums[]) {
        ArrayList<Integer> max = new ArrayList<>();
        ArrayList<Integer> min = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        int last = nums[mid];
       if(nums.length % 2 == 0){
           for (int i = 0; i <= mid; i++) {
               min.add(nums[i]);
           }
           for (int i = nums.length - 1; i > mid; i--) {
               max.add(nums[i]);
           }
           int j = 0;
           for(int i = 0;i<max.size();i++){
               nums[j++] = max.get(i);
               nums[j++] = min.get(i);
           }
       }
       else{
           for (int i = 0; i < mid; i++) {
               min.add(nums[i]);
           }
           for (int i = nums.length - 1; i > mid; i--) {
               max.add(nums[i]);
           }
           int j = 0;
           for(int i = 0;i<max.size();i++){
               nums[j++] = max.get(i);
               nums[j++] = min.get(i);
           }

           if(nums.length % 2 != 0){
               nums[nums.length - 1] = last;
           }
       }
    }
}