class Solution {
    static int commonSubseq(String S1, String S2) {
        Set<Character> set = new HashSet<>();
        for(char ch : S1.toCharArray()){
                set.add(ch);
        }
         for(char ch : S2.toCharArray()){
                if(set.contains(ch)){
                     return 1;
                }
        }
        return 0;
    }
}