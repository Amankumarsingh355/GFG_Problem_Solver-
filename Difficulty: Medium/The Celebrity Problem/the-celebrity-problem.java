public class Solution {
    public int celebrity(int[][] mat) {
        if (mat == null) return -1;
        int n = mat.length;
        if (n == 0) return -1;
        int a = 0, b = n - 1;
        while (a < b) {
            if (mat[a][b] == 1) a++;
            else b--;
        }
        int c = a;
        for (int i = 0; i < n; i++) {
            if (i == c) continue;
            if (mat[c][i] == 1) return -1;
            if (mat[i][c] == 0) return -1;
        }
        return c;
    }
    public static void main(String[] args) {
        int[][] M1 = {
            {1,1,0},
            {0,1,0},
            {0,1,1}
        };
        System.out.println(new Solution().celebrity(M1));
        int[][] M2 = {
            {1,1},
            {1,1}
        };
        System.out.println(new Solution().celebrity(M2));
        int[][] M3 = {
            {1}
        };
        System.out.println(new Solution().celebrity(M3));
    }
}