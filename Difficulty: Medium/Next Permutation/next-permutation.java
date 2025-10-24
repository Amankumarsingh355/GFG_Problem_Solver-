import java.util.Arrays;

public class Solution {
    public void nextPermutation(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        int n = arr.length;
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;
        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) j--;
            swap(arr, i, j);
        }
        reverse(arr, i + 1, n - 1);
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private void reverse(int[] a, int l, int r) {
        while (l < r) swap(a, l++, r--);
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] a1 = {2, 4, 1, 7, 5, 0};
        s.nextPermutation(a1);
        System.out.println(Arrays.toString(a1)); // [2, 4, 5, 0, 1, 7]

        int[] a2 = {3, 2, 1};
        s.nextPermutation(a2);
        System.out.println(Arrays.toString(a2)); // [1, 2, 3]

        int[] a3 = {3, 4, 2, 5, 1};
        s.nextPermutation(a3);
        System.out.println(Arrays.toString(a3)); // [3, 4, 5, 1, 2]
    }
}