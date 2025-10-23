public class Solution {
    public int shortestUnorderedSubarray(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0;
        int L = 0;
        while (L + 1 < n && arr[L] <= arr[L + 1]) L++;
        if (L == n - 1) return 0;
        int R = n - 1;
        while (R - 1 >= 0 && arr[R - 1] <= arr[R]) R--;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = L; i <= R; ++i) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        while (L - 1 >= 0 && arr[L - 1] > min) L--;
        while (R + 1 < n && arr[R + 1] < max) R++;
        return R - L + 1;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.shortestUnorderedSubarray(new int[] {7,9,10,8,11}));
        System.out.println(s.shortestUnorderedSubarray(new int[] {1,2,3,5}));    
        System.out.println(s.shortestUnorderedSubarray(new int[] {1,3,2,4,5})); 
        System.out.println(s.shortestUnorderedSubarray(new int[] {1}));
    }
}