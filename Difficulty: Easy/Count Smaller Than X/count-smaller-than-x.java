class Solution {
    public static int smallerThanX(int arr[], int n, int x) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<x){
                count++;
            }
        }
        return count;
    }
}