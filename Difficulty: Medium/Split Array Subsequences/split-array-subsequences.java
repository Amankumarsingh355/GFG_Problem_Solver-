class Solution {
    public boolean isPossibleSplit(int[] arr, int k) {
        if (k <= 1) return true;
        int n = arr.length;
        if (n < k) return false;
        Map<Integer,Integer> freq = new HashMap<>();
        Map<Integer,Integer> need = new HashMap<>();
        for (int v : arr) freq.put(v, freq.getOrDefault(v,0) + 1);
        for (int v : arr) {
            int f = freq.getOrDefault(v,0);
            if (f == 0) continue;
            int needed = need.getOrDefault(v,0);
            if (needed > 0) {
                need.put(v, needed - 1);
                need.put(v + 1, need.getOrDefault(v + 1, 0) + 1);
                freq.put(v, f - 1);
            } else {
                for (int i = 0; i < k; ++i) {
                    if (freq.getOrDefault(v + i, 0) <= 0) return false;
                }
                for (int i = 0; i < k; ++i) {
                    freq.put(v + i, freq.get(v + i) - 1);
                }
                need.put(v + k, need.getOrDefault(v + k, 0) + 1);
            }
        }
        return true;
    }
    public boolean isPossible(int[] arr, int k) {
        return isPossibleSplit(arr, k);
    }
}