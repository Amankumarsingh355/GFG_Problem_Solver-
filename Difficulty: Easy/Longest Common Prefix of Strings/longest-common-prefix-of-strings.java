public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int n = strs.length;
        String first = strs[0];
        if (first == null || first.length() == 0) return "";
        int minLen = first.length();
        for (int i = 1; i < n; i++) {
            if (strs[i] == null) return "";
            minLen = Math.min(minLen, strs[i].length());
        }
        int idx = 0;
        while (idx < minLen) {
            char c = first.charAt(idx);
            for (int i = 1; i < n; i++) {
                if (strs[i].charAt(idx) != c) {
                    return first.substring(0, idx);
                }
            }
            idx++;
        }
        return first.substring(0, idx);
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.longestCommonPrefix(new String[]{"geeksforgeeks","geeks","geek","geezer"}));
        System.out.println(s.longestCommonPrefix(new String[]{"hello","world"}));
        System.out.println(s.longestCommonPrefix(new String[]{"abc","abc","abc"}));
        System.out.println(s.longestCommonPrefix(new String[]{""}));
    }
}