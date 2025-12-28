class Solution {
    String URLify(String s) {
        return s.replaceAll("\\s","%20").trim();
    }
}