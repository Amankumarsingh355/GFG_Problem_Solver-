public class Solution {
    public boolean findTriplets(int[] arr) {
        if (arr == null || arr.length < 3) return false;
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                long sum = (long) arr[i] + arr[left] + arr[right];
                if (sum == 0) return true;
                if (sum < 0) left++;
                else right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] a1 = {0, -1, 2, -3, 1};
        System.out.println(sol.findTriplets(a1));

        int[] a2 = {1, 2, 3};
        System.out.println(sol.findTriplets(a2));

        int[] a3 = {-5, 3, 2, -1, 0, 1};
        System.out.println(sol.findTriplets(a3));
    }
}