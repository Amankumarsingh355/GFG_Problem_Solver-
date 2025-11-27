public class Solution {
    public Solution() { }
    public int findDiff(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int v : arr) {
            freq.put(v, freq.getOrDefault(v, 0) + 1);
        }
        if (freq.size() <= 1) return 0;
        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        for (int count : freq.values()) {
            if (count < minFreq) minFreq = count;
            if (count > maxFreq) maxFreq = count;
        }
        return maxFreq - minFreq;
    }
}