class Solution {
    public static boolean searchPattern(String str, String pat) {
        int pi = pat.length() - 1;
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == pat.charAt(pi)) {
                pi--;
                if(pi < 0) return true;
            } else {
                pi = pat.length() - 1;
            }
        }
        return false;
    }
}