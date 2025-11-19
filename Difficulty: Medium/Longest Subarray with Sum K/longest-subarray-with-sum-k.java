public class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        Map<Long,Integer> firstIndex = new HashMap<>(Math.max(16, n * 2));
        long pref = 0L;
        int best = 0;
        firstIndex.put(0L, -1);
        for (int i = 0; i < n; ++i) {
            pref += nums[i];
            long need = pref - k;
            Integer idx = firstIndex.get(need);
            if (idx != null) {
                int len = i - idx;
                if (len > best) best = len;
            }
            firstIndex.putIfAbsent(pref, i);
        }
        return best;
    }
}