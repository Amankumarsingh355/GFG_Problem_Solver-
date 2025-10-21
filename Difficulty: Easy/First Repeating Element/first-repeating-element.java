class Solution {
    public int firstRepeated(int[] arr) {
        Map<Integer, Integer> firstIndex = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (firstIndex.containsKey(arr[i])) {
                minIndex = Math.min(minIndex, firstIndex.get(arr[i]));
            } else {
                firstIndex.put(arr[i], i);
            }
        }
        if (minIndex == Integer.MAX_VALUE) return -1;
        return minIndex + 1; 
    }
}