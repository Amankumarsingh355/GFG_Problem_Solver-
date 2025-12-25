class Solution {
    String convert(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) ('z' - (ch - 'a')));
            } else if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) ('Z' - (ch - 'A')));
            } else {
                sb.append(ch); 
            }
        }
        return sb.toString();
    }
}