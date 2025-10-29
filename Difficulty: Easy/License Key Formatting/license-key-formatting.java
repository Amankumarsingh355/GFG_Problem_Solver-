class Solution{
    static String ReFormatString(String S, int K){
        String cleaned = S.replaceAll("-", "").toUpperCase();
        StringBuilder sb = new StringBuilder(cleaned);
        for (int i = sb.length() - K; i > 0; i -= K) {
            sb.insert(i, '-');
        }
        return sb.toString();
    }
}