class Solution {
    public int maxVal(List<Integer> arr) {
        int n = arr.size();
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max1 = Math.max(max1, arr.get(i) - i);
            min1 = Math.min(min1, arr.get(i) - i);
        }
        return max1 - min1;
    }
}