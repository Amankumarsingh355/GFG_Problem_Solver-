public class Solution {
    public String stringPartition(String S, int a, int b) {
        int n = S.length();
        if (n < 2) return "-1";
        boolean[] prefDiv = new boolean[n];
        boolean[] suffDiv = new boolean[n];
        int mod = 0;
        for (int i = 0; i < n; ++i) {
            int d = S.charAt(i) - '0';
            mod = (mod * 10 + d) % a;
            if (mod == 0) prefDiv[i] = true;
        }
        int cur = 0;
        int pow10 = 1 % b;
        for (int i = n - 1; i >= 0; --i) {
            int d = S.charAt(i) - '0';
            cur = (cur + d * pow10) % b;
            if (cur == 0) suffDiv[i] = true;
            pow10 = (pow10 * 10) % b;
        }
        for (int i = 0; i <= n - 2; ++i) {
            if (prefDiv[i] && suffDiv[i + 1]) {
                return S.substring(0, i + 1) + " " + S.substring(i + 1);
            }
        }
        return "-1";
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.stringPartition("1200", 4, 3)); 
        System.out.println(sol.stringPartition("125", 12, 5)); 
        System.out.println(sol.stringPartition("1000", 10, 25));
    }
}