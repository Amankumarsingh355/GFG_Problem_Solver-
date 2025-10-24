public class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (arr == null || k <= 0 || arr.length == 0) return res;
        int n = arr.length;
        if (k == 1) {
            for (int v : arr) res.add(v);
            return res;
        }
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) dq.pollFirst();
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) dq.pollLast();
            dq.offerLast(i);
            if (i >= k - 1) res.add(arr[dq.peekFirst()]);
        }
        return res;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        System.out.println(sol.maxOfSubarrays(arr1, 3));
        int[] arr2 = {5, 1, 3, 4, 2};
        System.out.println(sol.maxOfSubarrays(arr2, 1));
        int[] arr3 = {2, 2, 2, 2};
        System.out.println(sol.maxOfSubarrays(arr3, 2));
    }
}