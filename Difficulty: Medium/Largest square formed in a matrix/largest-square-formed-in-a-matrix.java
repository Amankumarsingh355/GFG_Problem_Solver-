class Solution {
    static int maxSquare(int mat[][]) {
        int answer = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i > 0 && j > 0) {
                    if (mat[i][j] > 0) {
                        mat[i][j] = 1 + Math.min(mat[i - 1][j - 1], Math.min(mat[i - 1][j], mat[i][j - 1]));
                    }
                }
                answer = Math.max(answer, mat[i][j]);
            }
        }
        return answer;
    }
}