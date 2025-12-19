class Solution {
    String firstRepChar(String s) {
        HashSet<Character>ts=new HashSet<>();
        for(char c:s.toCharArray()){
            if(!ts.add(c))
                return c+"";
        }
        return "-1";
    }
}