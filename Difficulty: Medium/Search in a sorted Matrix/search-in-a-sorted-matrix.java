public class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) return false;
        int n = mat.length, m = mat[0].length;
        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int r = mid / m;
            int c = mid % m;
            int val = mat[r][c];
            if (val == x) return true;
            if (val < x) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] a1 = {{1,5,9},{14,20,21},{30,34,43}};
        System.out.println(s.searchMatrix(a1, 14)); 
        int[][] a2 = {{1,5,9,11},{14,20,21,26},{30,34,43,50}};
        System.out.println(s.searchMatrix(a2, 42)); 
        int[][] a3 = {{87,96,99},{101,103,111}};
        System.out.println(s.searchMatrix(a3, 101));
    }
}