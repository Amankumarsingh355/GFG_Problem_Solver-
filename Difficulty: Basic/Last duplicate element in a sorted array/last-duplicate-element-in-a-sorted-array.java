class Solution {
    public int[] dupLastIndex(int[] arr) {
        int[] ans={-1,-1};
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]==arr[i-1]){
                ans[0]=i;
                ans[1]=arr[i];
                return ans;
            }
        }
       return ans;
    }
}