class Solution {
    public static List<Integer> posNegPair(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while(start < end && arr[start] < 0 && arr[end] > 0){
            int left = Math.abs(arr[start]);
            int right = arr[end];            
            if(left == right){
                ans.add(arr[end--]);
                ans.add(arr[start++]);
            }
            else if(left > right){
                start++;
            }
            else{
                end--;
            }
        }
        if(ans.size() == 0){
            ans.add(0);
        }
        Collections.reverse(ans);
        return ans;
    }
}