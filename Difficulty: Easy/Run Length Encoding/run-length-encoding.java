class Solution {
    public static String encode(String s) {
        StringBuilder sb = new StringBuilder();
        int c = 1;
        for(int i = 1; i <= s.length(); i++){
            if(i < s.length() && s.charAt(i) == s.charAt(i - 1)){
                c++;
            }
            else{
                sb.append(s.charAt(i - 1)).append(c);
                c = 1;
            }
        }
        return sb.toString();
    }
}