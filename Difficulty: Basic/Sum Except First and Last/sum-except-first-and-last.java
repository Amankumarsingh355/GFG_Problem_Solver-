class Solution {
    int sumExceptFirstLast(int[] arr) {
        int sum = 0;
        for(int i=1; i<arr.length-1; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main (String args[]){
        int arr[] = {5, 10, 1, 11};
        Solution obj = new Solution();
        obj.sumExceptFirstLast( arr );
    }
}