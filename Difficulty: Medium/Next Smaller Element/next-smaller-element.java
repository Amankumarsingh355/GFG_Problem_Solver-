class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] nums = new int[arr.length];
        Arrays.fill(nums, 0, arr.length,-1);
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                int idx = stack.pop();
                nums[idx] = arr[i];
            }
            stack.push(i);
        }
        for(int i=0; i<nums.length; i++){
            result.add(nums[i]);
        }
        return result;
    }
}