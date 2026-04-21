public class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        int[] pref = new int[n + 1];
        for (int i = 0; i < n; i++) pref[i + 1] = pref[i] + arr[i];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            if (l < 0) l = 0;
            if (r >= n) r = n - 1;
            int sum = pref[r + 1] - pref[l];
            int mean = sum / (r - l + 1);
            al.add(mean);
        }
        return al;
    }
}
