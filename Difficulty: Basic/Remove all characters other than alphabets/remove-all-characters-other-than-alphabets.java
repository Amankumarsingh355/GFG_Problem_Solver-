class Solution {
 String removeSpecialCharacter(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                sb.append(c);
            }
        }
        return sb.length() == 0 ? "-1" : sb.toString();
    }
}