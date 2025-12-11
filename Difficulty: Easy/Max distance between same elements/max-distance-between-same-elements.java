class Solution {
    public int maxDistance(int[] arr) {
        HashMap<Integer, Integer> firstOccurrence = new HashMap<>();
        int maxDist = 0;
        for (int i = 0; i < arr.length; i++) {
            if (firstOccurrence.containsKey(arr[i])) {
                int dist = i - firstOccurrence.get(arr[i]);
                maxDist = Math.max(maxDist, dist);
            } else {
                firstOccurrence.put(arr[i], i);
            }
        }
        return maxDist;
    }
}