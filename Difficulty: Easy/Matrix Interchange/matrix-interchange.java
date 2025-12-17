class Solution {
    void interchange(int matrix[][], int r, int c) {
        for(int i = 0; i < r; i++){
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][c-1];
            matrix[i][c-1] = temp;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}