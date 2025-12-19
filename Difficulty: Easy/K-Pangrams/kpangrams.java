class Solution {
    boolean kPangram(String str, int k) {
        Set<Character> set=new HashSet<>();
        if(str.length()<26) return false;
        int charCount=0;
        for(char a:str.toCharArray()){
            if(Character.isLetter(a)){
                charCount++;
                set.add(a);
            }
        }
        if(charCount<26) return false;
        return 26-set.size()<=k;
    }
}