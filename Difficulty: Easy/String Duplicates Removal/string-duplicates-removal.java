class Solution {
    String removeDuplicates(String s) {
        Map<Character, Integer> map = new HashMap<>();
        String ans = "";
        for(int i=0;i<s.length();i++) {
            if(!map.containsKey(s.charAt(i))) {
                ans+=s.charAt(i);
            }
            map.put(s.charAt(i), 1);
        }
        return ans;
    }
}