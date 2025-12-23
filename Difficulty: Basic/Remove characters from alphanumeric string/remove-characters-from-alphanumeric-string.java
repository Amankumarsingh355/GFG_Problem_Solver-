class Solution {
    String removeCharacters(String s) {
        StringBuilder res = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9')
               res.append(ch);
        }
        return res.toString();
    }
}