class Solution {
    void segregateEvenOdd(int arr[]) {
        Arrays.sort(arr);
        int temp[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}