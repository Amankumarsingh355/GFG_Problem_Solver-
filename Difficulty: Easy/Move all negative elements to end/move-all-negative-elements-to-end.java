class Solution {
    public void segregateElements(int[] arr) {
        int[] newsarr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                newsarr[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                newsarr[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newsarr[i];
        }
    }
}