class Solution {
    public static char extraChar(String s1, String s2) {
        int xor=0;
        for(char c:s1.toCharArray()){
            xor^=c;
        }
        for(char c:s2.toCharArray()){
            xor^=c;
        }
        return (char)xor;
    }
}