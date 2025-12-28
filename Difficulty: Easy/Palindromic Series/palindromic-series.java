class Solution {
    public static boolean pallan(int n) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sb.append((char) ('a' + d));
            sum += d;
            n /= 10;
        }
        String S = sb.reverse().toString();
        int L = S.length();
        for (int i = 0; i < sum / 2; i++) {
            char left  = S.charAt(i % L);
            char right = S.charAt((sum - 1 - i) % L);
            if (left != right) {
                return false;
            }
        }
        return true;
    }
}