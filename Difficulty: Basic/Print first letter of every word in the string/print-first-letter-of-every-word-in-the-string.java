class Solution {
    String firstAlphabet(String S) {
        String[] spltarr=S.split(" ");
        char[] char_arr=new char[spltarr.length];
        for(int i=0;i<spltarr.length;i++){
            char_arr[i]=spltarr[i].charAt(0);
        }
        return new String(char_arr);
     }
};