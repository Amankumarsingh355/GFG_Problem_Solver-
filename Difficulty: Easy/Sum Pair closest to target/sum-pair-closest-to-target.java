class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr.length<=1){
            return ans;
        }
        int low = 0;
         int high = arr.length-1;
         int i1 =0;
         int i2=0;
         int min = Integer.MAX_VALUE;
         Arrays.sort(arr);
         while(low<high){
             int sum = arr[low]+arr[high];
            if(sum>target){
             if(min>(sum-target)){
                 min = sum-target;
                 i1=low;
                 i2 = high;
             }
                high--;
            }
            else if(sum == target){
                ans.add(arr[low]);
                ans.add(arr[high]);
                
                return  ans;
            }
            else{
                if(min>(target-sum)){
                 min = target-sum;
                i1 = low;
                i2 =high;
               }
                low++; 
            }
         }
         ans.add(arr[i1]);
         ans.add(arr[i2]);
         return ans;
    }
}