class Solution {
    public static int palPartition(String s) {
        if (s == null || s.length() <= 1) return 0;
        int n = s.length();
        int[] cuts = new int[n];
        for (int i = 0; i < n; i++) cuts[i] = i;
        for (int center = 0; center < n; center++) {
            int l = center, r = center;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                int newCuts = (l == 0) ? 0 : cuts[l - 1] + 1;
                if (newCuts < cuts[r]) cuts[r] = newCuts;
                l--; r++;
            }
            l = center; r = center + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                int newCuts = (l == 0) ? 0 : cuts[l - 1] + 1;
                if (newCuts < cuts[r]) cuts[r] = newCuts;
                l--; r++;
            }
        }
        return cuts[n - 1];
    }
    public static void main(String[] args) {
        System.out.println(palPartition("geek"));
        System.out.println(palPartition("aaaa"));
        System.out.println(palPartition("ababbbabbababa"));
    }
}