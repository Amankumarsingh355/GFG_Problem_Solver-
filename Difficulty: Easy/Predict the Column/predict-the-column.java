class Solution {
    int columnWithMaxZeros(int arr[][], int N) {
        int maxCount = 0, res = -1;
        int rows = arr.length, cols = arr[0].length;
        for (int col = 0; col < cols; col++) {
            int count = 0;
            for (int row = 0; row < rows; row++) {
                if (arr[row][col] == 0) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                res = col;
            }
        }
        return res;
    }
}