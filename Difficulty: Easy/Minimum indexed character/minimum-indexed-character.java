class Solution {
    public static int minIndexChar(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        for (char ch : s2.toCharArray()) {
            set.add(ch);
        }
        for (int i = 0; i < s1.length(); i++) {
            if (set.contains(s1.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}  