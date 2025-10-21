public class Solution {
    public boolean solveSudoku(int[][] mat) {
        if (mat == null || mat.length != 9 || mat[0].length != 9) return false;
        int[] rowMask = new int[9]; 
        int[] colMask = new int[9];   
        int[] boxMask = new int[9];
        java.util.List<int[]> blanks = new java.util.ArrayList<>();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                int v = mat[r][c];
                if (v == 0) {
                    blanks.add(new int[]{r, c});
                } else {
                    int bit = 1 << (v - 1);
                    rowMask[r] |= bit;
                    colMask[c] |= bit;
                    boxMask[(r / 3) * 3 + (c / 3)] |= bit;
                }
            }
        }
        return dfs(mat, 0, blanks, rowMask, colMask, boxMask);
    }
    private boolean dfs(int[][] mat, int index, java.util.List<int[]> blanks,
                        int[] rowMask, int[] colMask, int[] boxMask) {
        if (index == blanks.size()) return true; 
        int bestIdx = -1;
        int bestCount = 10;
        for (int i = index; i < blanks.size(); i++) {
            int r = blanks.get(i)[0], c = blanks.get(i)[1];
            int used = rowMask[r] | colMask[c] | boxMask[(r / 3) * 3 + (c / 3)];
            int candidates = (~used) & 0x1FF; 
            int count = Integer.bitCount(candidates);
            if (count < bestCount) {
                bestCount = count;
                bestIdx = i;
                if (count == 1) break;
            }
        }
        if (bestIdx != index) {
            int[] tmp = blanks.get(index);
            blanks.set(index, blanks.get(bestIdx));
            blanks.set(bestIdx, tmp);
        }
        int r = blanks.get(index)[0], c = blanks.get(index)[1];
        int box = (r / 3) * 3 + (c / 3);
        int used = rowMask[r] | colMask[c] | boxMask[box];
        int candidates = (~used) & 0x1FF; 
        while (candidates != 0) {
            int pickBit = candidates & -candidates; 
            int digit = Integer.numberOfTrailingZeros(pickBit) + 1;
            mat[r][c] = digit;
            rowMask[r] |= pickBit;
            colMask[c] |= pickBit;
            boxMask[box] |= pickBit;
            if (dfs(mat, index + 1, blanks, rowMask, colMask, boxMask)) return true;
            mat[r][c] = 0;
            rowMask[r] &= ~pickBit;
            colMask[c] &= ~pickBit;
            boxMask[box] &= ~pickBit;
            candidates &= candidates - 1;
        }
        if (bestIdx != index) {
            int[] tmp = blanks.get(index);
            blanks.set(index, blanks.get(bestIdx));
            blanks.set(bestIdx, tmp);
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };
        Solution s = new Solution();
        if (s.solveSudoku(mat)) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) System.out.print(mat[i][j] + " ");
                System.out.println();
            }
        } else {
            System.out.println("No solution");
        }
    }
}