public class Solution {
    public String findOrder(String[] words) {
        if (words == null || words.length == 0) return "";
        int n = words.length;
        boolean[] present = new boolean[26];
        for (String w : words) for (char c : w.toCharArray()) present[c - 'a'] = true;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 26; i++) adj.add(new ArrayList<>());
        int[] indeg = new int[26];
        for (int i = 0; i + 1 < n; i++) {
            String a = words[i], b = words[i + 1];
            int len = Math.min(a.length(), b.length());
            int j = 0;
            while (j < len && a.charAt(j) == b.charAt(j)) j++;
            if (j == len) {
                if (a.length() > b.length()) return "";
                continue;
            }
            int u = a.charAt(j) - 'a';
            int v = b.charAt(j) - 'a';
            if (!adj.get(u).contains(v)) {
                adj.get(u).add(v);
                indeg[v]++;
            }
        }
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < 26; i++) if (present[i] && indeg[i] == 0) q.add(i);
        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            int u = q.poll();
            sb.append((char)('a' + u));
            for (int v : adj.get(u)) {
                indeg[v]--;
                if (indeg[v] == 0 && present[v]) q.add(v);
            }
        }
        int countPresent = 0;
        for (boolean p : present) if (p) countPresent++;
        if (sb.length() != countPresent) return "";
        return sb.toString();
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] w1 = {"baa","abcd","abca","cab","cad"};
        System.out.println(s.findOrder(w1));
        String[] w2 = {"caa","aaa","aab"};
        System.out.println(s.findOrder(w2));
        String[] w3 = {"ab","cd","ef","ad"};
        System.out.println(s.findOrder(w3));
    }
}