class Solution {
    static String conRevstr(String S1, String S2) {
        String s = S1+S2;
        char[] ch = s.toCharArray();
        String rev = "";
        for(int i=ch.length-1;i>=0;i--){
            rev += ch[i];
        }
        return rev;
    }
}