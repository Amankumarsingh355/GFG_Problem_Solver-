class Solution{
    int getOddOccurrence(int[] arr) {
        HashMap<Integer, Integer> nums = new HashMap<>();
        for(int num : arr){
            if(nums.getOrDefault(num, 0) == 0){
                nums.put(num, 1);
            }
            else{
                nums.put(num, nums.getOrDefault(num, 0)+1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : nums.entrySet()){
            if(entry.getValue() % 2 == 1) return entry.getKey();
        }
        return -1;
    }
}