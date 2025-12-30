class Solution {
    int nthItem(int L1, int L2, int[] A, int[] B, int N) {
        Set<Integer> set = new HashSet<>();
        for (int num1 : A) {
            for (int num2 : B) {
                set.add(num1 + num2);
            }
        }
        if (N > set.size()) {
            return -1;
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.get(N - 1);
    }
}