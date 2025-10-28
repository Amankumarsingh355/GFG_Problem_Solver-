class Solution {
    static String findAndReplace(String S, int Q, int[] index, String[] sources, String[] targets) {
        int n = S.length();
        Map<Integer, Pair> map = new HashMap<>();
        for (int k = 0; k < Q; k++) {
            int idx = index[k];
            String src = sources[k];
            if (idx >= 0 && idx + src.length() <= n && S.startsWith(src, idx)) {
                map.put(idx, new Pair(src.length(), targets[k]));
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < n) {
            if (map.containsKey(i)) {
                Pair p = map.get(i);
                sb.append(p.target);
                i += p.len;
            } else {
                sb.append(S.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
    static class Pair {
        int len;
        String target;
        Pair(int len, String target) {
            this.len = len;
            this.target = target;
        }
    }
}