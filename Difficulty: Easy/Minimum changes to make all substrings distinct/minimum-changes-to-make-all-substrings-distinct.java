class Solution {
    static int minChange(String S){
        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<S.length();i++){
            h.add(S.charAt(i));
        }
        return   S.length() - h.size();
    }
}
