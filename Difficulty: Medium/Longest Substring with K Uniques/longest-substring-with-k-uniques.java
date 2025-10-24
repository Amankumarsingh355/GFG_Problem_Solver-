public class Solution {
    public int longestKSubstr(String s, int k) {
        if (s == null || s.length() == 0 || k <= 0) return -1;
        int n = s.length();
        int[] freq = new int[26];
        int distinct = 0;
        int left = 0;
        int maxLen = -1;
        for (int right = 0; right < n; right++) {
            int r = s.charAt(right) - 'a';
            if (freq[r]++ == 0) distinct++;
            while (distinct > k && left <= right) {
                int l = s.charAt(left) - 'a';
                if (--freq[l] == 0) distinct--;
                left++;
            }
            if (distinct == k) maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(obj.longestKSubstr(s, k));
        System.out.println(obj.longestKSubstr("aaaa", 2));
        System.out.println(obj.longestKSubstr("aabaaab", 2));
    }
}