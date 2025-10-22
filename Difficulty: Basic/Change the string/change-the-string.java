public class Solution {
    public String modify(String s) {
        if (s == null || s.isEmpty()) return s;
        return Character.isUpperCase(s.charAt(0)) ? s.toUpperCase() : s.toLowerCase();
    }
    public static void main(String[] args) {
        Solution ob = new Solution();
        System.out.println(ob.modify("abCD")); 
        System.out.println(ob.modify("Abcd"));
    }
}