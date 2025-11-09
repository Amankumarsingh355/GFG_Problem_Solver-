class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        int small=0;
        int large=0;
        for (int i=0; i<arr.length;i++){
            if(arr[i]<=target){
                small++;
            }
            if(arr[i]>=target){
                large++;
            }
        }
        return new int[]{small,large};
    }
}