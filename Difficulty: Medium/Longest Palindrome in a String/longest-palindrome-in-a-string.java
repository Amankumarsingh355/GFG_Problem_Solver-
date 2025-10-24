public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) return s == null ? "" : s;
        int n = s.length();
        int bestStart = 0;
        int bestLen = 1;
        for (int center = 0; center < n; center++) {
            int[] odd = expand(s, center, center);
            if (odd[1] - odd[0] + 1 > bestLen) {
                bestStart = odd[0];
                bestLen = odd[1] - odd[0] + 1;
            }
            int[] even = expand(s, center, center + 1);
            if (even[1] - even[0] + 1 > bestLen) {
                bestStart = even[0];
                bestLen = even[1] - even[0] + 1;
            }
        }
        return s.substring(bestStart, bestStart + bestLen);
    }
    private int[] expand(String s, int l, int r) {
        int n = s.length();
        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return new int[]{l + 1, r - 1};
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.longestPalindrome("forgeeksskeegfor"));
        System.out.println(sol.longestPalindrome("Geeks"));       
        System.out.println(sol.longestPalindrome("abc"));          
        System.out.println(sol.longestPalindrome("a"));        
        System.out.println(sol.longestPalindrome(""));
    }
}