public class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;
        int[] map1 = new int[26];
        int[] map2 = new int[26];
        for (int i = 0; i < 26; i++) { map1[i] = -1; map2[i] = -1; }
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            int a = s1.charAt(i) - 'a';
            int b = s2.charAt(i) - 'a';
            if (map1[a] == -1 && map2[b] == -1) {
                map1[a] = b;
                map2[b] = a;
            } else {
                if (map1[a] != b || map2[b] != a) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s1 = "aab", s2 = "xxy";
        boolean a = obj.areIsomorphic(s1, s2);
        System.out.println(a);
        System.out.println(obj.areIsomorphic("aab", "xyz"));
        System.out.println(obj.areIsomorphic("abc", "xxz"));
    }
}