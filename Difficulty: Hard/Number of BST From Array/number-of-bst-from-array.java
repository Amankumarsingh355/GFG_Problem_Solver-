public class Solution {
    private int[] catalanNumbers(int n) {
        int[] catalan = new int[n + 1];
        catalan[0] = 1;
        catalan[1] = 1;
        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }
        return catalan;
    }
    public ArrayList<Integer> countBSTs(int[] arr) {
        int n = arr.length;
        int[] catalan = catalanNumbers(n);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int L = 0, R = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) L++;
                else if (arr[j] > arr[i]) R++;
            }
            result.add(catalan[L] * catalan[R]);
        }
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {2, 1, 3};
        ArrayList<Integer> result = sol.countBSTs(arr);
        for (int x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}