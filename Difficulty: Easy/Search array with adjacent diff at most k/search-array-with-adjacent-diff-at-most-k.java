class Solution {
    public int findStepKeyIndex(int[] arr, int k, int x) {
        int n = arr.length ; 
        int i = 0;
    while (i < n) {
        if (arr[i] == x) {
            return i;
        }
        int jump = Math.max(1, Math.abs(arr[i] - x) / k);
        i+=jump;
    }
    return -1;
    }
}