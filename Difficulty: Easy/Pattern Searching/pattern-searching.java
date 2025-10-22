public class Solution {
    public int search(String text, String pat) {
        if (pat == null || text == null) return 0;
        int n = text.length(), m = pat.length();
        if (m == 0) return 1;
        if (n < m) return 0;
        int[] lps = buildLps(pat);
        int i = 0, j = 0;
        while (i < n) {
            if (text.charAt(i) == pat.charAt(j)) {
                i++; j++;
                if (j == m) return 1;
            } else {
                if (j != 0) j = lps[j - 1];
                else i++;
            }
        }
        return 0;
    }
    private int[] buildLps(String pat) {
        int m = pat.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;
        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.search("geeksforgeeks", "geek"));
        System.out.println(s.search("geeksforgeeks", "gfg"));
    }
}