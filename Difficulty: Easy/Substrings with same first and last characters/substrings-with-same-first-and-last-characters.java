class Solution {
    public int countSubstring(String s) {
        int ans = s.length();
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
            ans += freq[c - 'a'] - 1;
        }
        return ans;
    }
}