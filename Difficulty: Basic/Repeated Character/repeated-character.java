class Solution {
    char firstRep(String S) {
        int[] f = new int[26];
        for(char c : S.toCharArray()){
            f[c-'a']++;
        }
        for(char c: S.toCharArray()){
            if(f[c-'a'] >= 2){
                return c;
            }
        }
        return '#';
    }
}