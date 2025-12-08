class Solution {
    public int firstNonRepeating(int[] arr) {
        Map<Integer,Integer> m = new HashMap<>();
        for (int i : arr) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        for (int i : arr) {
            if (m.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
}