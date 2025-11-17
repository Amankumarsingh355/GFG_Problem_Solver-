class Solution {
    public long findMultiplication(int[] arr1, int[] arr2) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : arr1){
            if(num > max){
                max = num;
            }
        }
        for( int num : arr2){
            if(num < min){
                min = num;
            }
        }
        return min * max;
    }
}