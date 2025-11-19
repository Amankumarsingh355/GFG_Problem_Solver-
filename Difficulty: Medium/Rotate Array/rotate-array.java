class Solution {
    static void rotateArr(int arr[], int d) {
        d=d%arr.length;
       reverse(arr,0,d-1);
       reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void reverse( int[] arr, int start, int end){
        while(start<end){
            int swap = arr[start];
            arr[start]= arr[end];
            arr[ end]= swap;
            start++;
            end--;
        }
    }
}