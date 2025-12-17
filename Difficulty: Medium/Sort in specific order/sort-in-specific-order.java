class Solution {
    public void sortIt(int[] arr) {
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> even = new PriorityQueue<>();
        for (int i : arr) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        int[] result = new int[arr.length];
        int oddCount = odd.size();
        for (int i = 0; i < arr.length; i++) {
            if (i < oddCount) {
                arr[i] = odd.poll();
            } else {
                arr[i] = even.poll();
            }
        }
    }
}