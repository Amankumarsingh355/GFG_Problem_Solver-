class Solution {
    public String[] findPrefixes(String[] arr, int N) {
        String[][] words = new String[N][2];
        for (int i = 0; i < N; i++) {
            words[i][0] = arr[i];
            words[i][1] = String.valueOf(i);
        }
        Arrays.sort(words, Comparator.comparing(a -> a[0]));
        int[] prefixLens = new int[N];
        for (int i = 0; i < N; i++) {
            int left = (i > 0) ? commonPrefix(words[i][0], words[i - 1][0]) : 0;
            int right = (i < N - 1) ? commonPrefix(words[i][0], words[i + 1][0]) : 0;
            prefixLens[i] = Math.max(left, right) + 1;
        }
        String[] res = new String[N];
        for (int i = 0; i < N; i++) {
            int idx = Integer.parseInt(words[i][1]);
            int len = Math.min(prefixLens[i], words[i][0].length());
            res[idx] = words[i][0].substring(0, len);
        }
        return res;
    }
    private int commonPrefix(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int i = 0;
        while (i < len && a.charAt(i) == b.charAt(i)) i++;
        return i;
    }
}