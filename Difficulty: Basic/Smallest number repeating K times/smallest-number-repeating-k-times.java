class Solution {
    public int findDuplicate(int[] arr, int k) {
        HashMap <Integer, Integer> freq = new HashMap<>();
        for(int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int ans = Integer.MAX_VALUE;
        for(int num : freq.keySet()) {
            if(freq.get(num) == k) {
                ans = Math.min(ans, num);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}