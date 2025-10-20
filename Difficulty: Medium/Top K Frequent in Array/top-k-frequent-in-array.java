public class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                int freqCompare = freqMap.get(b) - freqMap.get(a);
                if (freqCompare == 0) return b - a;
                return freqCompare;
            }
        );
        for (int num : freqMap.keySet()) pq.offer(num);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) result.add(pq.poll());
        return result;
    }
}