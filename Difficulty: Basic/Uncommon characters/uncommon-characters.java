class Solution {
    String uncommonChars(String s1, String s2) {
        String res = "";
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (s2.indexOf(c) == -1 && res.indexOf(c) == -1) {
                res += c;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (s1.indexOf(c) == -1 && res.indexOf(c) == -1) {
                res += c;
            }
        }
   char[] arr = res.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}