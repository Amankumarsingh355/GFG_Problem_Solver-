public class Solution {
    public int largest(int[] arr) {
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        int mx = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > mx) mx = arr[i];
        }
        return mx;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.largest(new int[] {1, 8, 7, 56, 90}));
        System.out.println(obj.largest(new int[] {5, 5, 5, 5}));
        System.out.println(obj.largest(new int[] {10}));
    }
}