public class Solution {
    public int minIteration(int N, int M, int X, int Y) {
        int d1 = (X - 1) + (Y - 1);
        int d2 = (X - 1) + (M - Y);
        int d3 = (N - X) + (Y - 1);
        int d4 = (N - X) + (M - Y);
        return Math.max(Math.max(d1, d2), Math.max(d3, d4));
    }
    public static void main(String[] args) {
        Solution ob = new Solution();
        System.out.println(ob.minIteration(2, 3, 2, 3)); 
        System.out.println(ob.minIteration(1, 1, 1, 1));
    }
}