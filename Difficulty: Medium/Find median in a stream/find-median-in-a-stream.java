public class Solution {
    public ArrayList<Double> getMedian(int[] nums) {
        ArrayList<Double> medians = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int x : nums) {
            if (maxHeap.isEmpty() || x <= maxHeap.peek()) maxHeap.offer(x);
            else minHeap.offer(x);
            if (maxHeap.size() > minHeap.size() + 1) minHeap.offer(maxHeap.poll());
            else if (minHeap.size() > maxHeap.size()) maxHeap.offer(minHeap.poll());
            if (maxHeap.size() == minHeap.size()) {
                double median = (maxHeap.peek() + minHeap.peek()) / 2.0;
                medians.add(median);
            } else {
                medians.add((double) maxHeap.peek());
            }
        }
        return medians;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a1 = {5, 15, 1, 3, 2, 8};
        System.out.println(s.getMedian(a1));
        int[] a2 = {2, 2, 2, 2};
        System.out.println(s.getMedian(a2));
    }
}