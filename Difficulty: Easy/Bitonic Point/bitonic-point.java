class Solution {
    public int findMaximum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]) {
                return arr[i];
            }
        }
        return -1;
    }
}