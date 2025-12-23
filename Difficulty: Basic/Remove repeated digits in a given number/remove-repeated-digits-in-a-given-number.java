class Solution {
    public long modify(long N) {
        String s = Long.toString(N);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (result.length() == 0 || result.charAt(result.length() - 1) != s.charAt(i)) {
                result.append(s.charAt(i));
            }
        }
        return Long.parseLong(result.toString());
    }
}