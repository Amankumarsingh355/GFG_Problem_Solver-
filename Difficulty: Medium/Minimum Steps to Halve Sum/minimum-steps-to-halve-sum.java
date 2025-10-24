public class Solution {
    public int minOperations(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0.0;
        for (int v : arr) {
            pq.add((double) v);
            sum += v;
        }
        double target = sum / 2.0;
        int ops = 0;
        while (sum > target) {
            double top = pq.poll();
            double half = top / 2.0;
            sum -= half;
            pq.add(half);
            ops++;
        }
        return ops;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minOperations(new int[]{8,6,2}));
        System.out.println(s.minOperations(new int[]{9,1,2}));
    }
}