class Solution {
    static String getCrazy(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean is = Character.isUpperCase(s.charAt(0));
        for(int i=0;i<s.length();i++){
            if((i%2==0) == is){
                sb.setCharAt(i,Character.toUpperCase(s.charAt(i)));
            }
            else{
                sb.setCharAt(i,Character.toLowerCase(s.charAt(i)));
            }
        }
        return sb.toString();
    }
}

