class Solution {
    public static int leftElement(int[] arr) {
        Arrays.sort(arr);
        int left=0,right=arr.length-1;
        while(left<right){
            right--;
            left++;
        }
        return arr[right];
    }
}