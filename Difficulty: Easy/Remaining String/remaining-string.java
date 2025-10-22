public class Solution {
    public String printString(String s, char ch, int count) {
        int occ = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                occ++;
                if (occ == count) {
                    if (i + 1 >= s.length()) return "";
                    return s.substring(i + 1);
                }
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Solution ob = new Solution();
        System.out.println(ob.printString("Thisisdemostring", 'i', 3));
        System.out.println(ob.printString("Thisisdemostri", 'i', 3));   
        System.out.println(ob.printString("abcd", 'x', 2));             
    }
}