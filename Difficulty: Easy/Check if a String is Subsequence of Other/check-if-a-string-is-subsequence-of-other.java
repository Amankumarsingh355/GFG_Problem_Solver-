class Solution {
    public boolean isSubSeq(String s1, String s2) {
        for(int i = 0, idx = 0; i < s2.length(); i++){
            if(s1.charAt(idx) == s2.charAt(i)) idx++;
            if(idx == s1.length()) return true;
        }
        return false;
    }
};