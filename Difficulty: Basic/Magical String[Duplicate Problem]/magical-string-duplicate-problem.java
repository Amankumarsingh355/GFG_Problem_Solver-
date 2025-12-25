class Solution {
    static String magicalString(String S) {
        String alpha="abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++)
        {
           char ch=S.charAt(i);
           int index='z' - ch; 
           sb.append(alpha.charAt(index));
        }
        return sb.toString();
    }
}