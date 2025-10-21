public class Solution {
    public static void nearlySorted(int[] arr, int k) {
        if (arr == null || arr.length <= 1 || k <= 0) return;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = arr.length;
        int index = 0;
        for (int i = 0; i < Math.min(n, k + 1); i++) {
            minHeap.offer(arr[i]);
        }
        for (int i = k + 1; i < n; i++) {
            arr[index++] = minHeap.poll();
            minHeap.offer(arr[i]);
        }
        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();
        }
    }
    public static void main(String[] args) {
        int[] a1 = {2, 3, 1, 4};
        nearlySorted(a1, 2);
        System.out.println(Arrays.toString(a1)); 
        int[] a2 = {7, 9, 14};
        nearlySorted(a2, 1);
        System.out.println(Arrays.toString(a2));
    }
}