class Solution {
    int findSum(int arr[]) {
       int result = Arrays.stream(arr).distinct().sum();
       return result;
        
    }
}