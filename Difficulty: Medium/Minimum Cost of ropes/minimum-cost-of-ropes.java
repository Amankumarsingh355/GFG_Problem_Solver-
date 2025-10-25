class Solution {
    public static int minCost(int[] arr) {
        if (arr == null || arr.length <= 1) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : arr) pq.add(x);
        int totalCost = 0;
        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            int combined = a + b;
            totalCost += combined;
            pq.add(combined);
        }
        return totalCost;
    }
}