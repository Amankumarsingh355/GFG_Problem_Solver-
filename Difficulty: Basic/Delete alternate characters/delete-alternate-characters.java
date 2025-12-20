class Solution {
    static String delAlternate(String S) {
        String a="";
        for(int i=0;i<S.length();i=i+2){
            a=a+S.charAt(i);
        }
        return a;
    }
}