class Solution {
    public int longestUniqueSubstring(String s) {
        Set<Character> sub = new HashSet<>(); 
        int st = 0;
        int maxLen = 0;
        for(int en = 0; en < s.length(); en++) {
            while(sub.contains(s.charAt(en))) {
                sub.remove(s.charAt(st));
                st++;
            }
            sub.add(s.charAt(en));
            maxLen = Math.max(maxLen, en - st + 1);
        }
        return maxLen;
    }
}