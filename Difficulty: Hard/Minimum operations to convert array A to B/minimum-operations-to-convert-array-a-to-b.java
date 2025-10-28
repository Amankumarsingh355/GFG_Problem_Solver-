class Solution {
    static int minInsAndDel(int[] A, int[] B, int N, int M) {
        Map<Integer, Integer> pos = new HashMap<>(M * 2);
        for (int i = 0; i < M; i++) pos.put(B[i], i);
        ArrayList<Integer> seq = new ArrayList<>();
        for (int x : A) {
            Integer p = pos.get(x);
            if (p != null) seq.add(p);
        }
        if (seq.isEmpty()) {
            return N + M;
        }
        int size = 0;
        int[] tails = new int[seq.size()];
        for (int v : seq) {
            int i = Arrays.binarySearch(tails, 0, size, v);
            if (i < 0) i = -(i + 1);
            tails[i] = v;
            if (i == size) size++;
        }
        int lcsLength = size;
        int deletions = N - lcsLength;
        int insertions = M - lcsLength;
        return deletions + insertions;
    }
}