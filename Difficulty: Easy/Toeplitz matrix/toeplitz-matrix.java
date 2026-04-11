class Solution {
    public boolean isToeplitz(int[][] mat) {
        // code here
        int n = mat.length, m = mat[0].length;
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = i - j;
                map.computeIfAbsent(sum, k -> new HashSet<>()).add(mat[i][j]);
            }
        }
        for (Map.Entry<Integer, HashSet<Integer>> em : map.entrySet()) {
            int k = em.getKey();
            HashSet<Integer> v = em.getValue();
            if (v.size() != 1)
                return false;
        }
        return true;
    }
}