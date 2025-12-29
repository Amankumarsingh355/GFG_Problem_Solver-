class Solution {
    public void reverseInGroups(int[] arr, int k) {
        int n = arr.length;
        for(int i=0;i<n;i=i+k){
            int start = i;
            int end = (i+k-1) < (n-1) ? (i+k-1) : (n-1);
            reverse(arr,start,end);
        }
    }
    public void reverse(int[] arr,int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}