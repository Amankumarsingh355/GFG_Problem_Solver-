class Solution {
    public boolean nonRepetitive(String S) {
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<S.length();i++){
            hs.add(S.charAt(i));
        }
        for(int j=1;j<S.length();j++){
            if(S.charAt(j-1)==S.charAt(j))
                continue;
            if(!hs.contains(S.charAt(j)))
                return false;
            else{
                hs.remove(S.charAt(j-1));
            } 
        }
        return true;
    }
}