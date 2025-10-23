public class Solution {
    public char profession(long level, long pos) {
        long flips = Long.bitCount(pos - 1);
        return (flips % 2 == 0) ? 'e' : 'd';
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.profession(4, 2));
        System.out.println(sol.profession(3, 4));
        System.out.println(sol.profession(1, 1));
        System.out.println(sol.profession(5, 11));
    }
}