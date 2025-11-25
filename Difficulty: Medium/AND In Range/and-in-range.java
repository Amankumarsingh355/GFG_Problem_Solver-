public class Solution {
    public int andInRange(int l, int r) {
        int ans = l;
        int diff = r - l;
        int bit = 1;
        while (bit > 0 && bit <= diff) {
            if ((ans & bit) != 0) {
                ans = ans & ~bit;
            }
            bit <<= 1;
        }
        return ans & r;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.andInRange(8, 13));
        System.out.println(s.andInRange(2, 3));
    }
}