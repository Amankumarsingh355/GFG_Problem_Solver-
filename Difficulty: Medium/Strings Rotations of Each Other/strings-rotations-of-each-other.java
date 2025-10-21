class Solution {
    private final long MOD = 1000000007;
    private final long BASE = 31;
    public boolean areRotations(String s1, String s2) {
        int n = s1.length();
        if (n != s2.length()) return false;
        if (n == 0) return true;
        long hashS2 = 0;
        long pow = 1;
        for (int i = 0; i < n; i++) {
            hashS2 = (hashS2 * BASE + (s2.charAt(i) - 'a' + 1)) % MOD;
            if (i < n - 1) pow = (pow * BASE) % MOD;
        }
        long hashS1 = 0;
        for (int i = 0; i < n; i++) {
            hashS1 = (hashS1 * BASE + (s1.charAt(i) - 'a' + 1)) % MOD;
        }
        if (hashS1 == hashS2 && s1.equals(s2)) return true;
        for (int i = 0; i < n - 1; i++) {
            long first = (s1.charAt(i) - 'a' + 1) * pow % MOD;
            hashS1 = ((hashS1 - first + MOD) * BASE + (s1.charAt(i) - 'a' + 1)) % MOD;
            if (hashS1 == hashS2) {
                boolean match = true;
                for (int j = 0; j < n; j++) {
                    if (s1.charAt((i + 1 + j) % n) != s2.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) return true;
            }
        }
        return false;
    }
}