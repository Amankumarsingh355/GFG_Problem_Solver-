class Solution {
    public ArrayList<Integer> countArray(int[] nums, int x) {
       ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int i = 0;i<nums.length;i++){
            int avg = (nums[i]+x)/2;
            if(map.containsKey(avg)){
                list.add(map.get(avg));
            }
            else{
                list.add(0);
            }
        }
        return list;
    }
}