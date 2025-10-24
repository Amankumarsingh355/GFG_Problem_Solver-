public class Solution {
    public void reverseArray(int[] arr) {
        if (arr == null) return;
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int t = arr[l];
            arr[l++] = arr[r];
            arr[r--] = t;
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a1 = {1, 4, 3, 2, 6, 5};
        s.reverseArray(a1);
        System.out.println(Arrays.toString(a1));
        int[] a2 = {4, 5, 2};
        s.reverseArray(a2);
        System.out.println(Arrays.toString(a2));
        int[] a3 = {1};
        s.reverseArray(a3);
        System.out.println(Arrays.toString(a3));
    }
}