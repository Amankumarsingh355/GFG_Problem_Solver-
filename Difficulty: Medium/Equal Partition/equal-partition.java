public class Solution {
    public ArrayList<ArrayList<Integer>> equalPartition(int[] arr) {
        int n = arr.length;
        long total = 0;
        for (int v : arr) total += v;
        if ((total & 1L) != 0L) return new ArrayList<>();
        long target = total / 2;
        int k = n / 2;
        int limit = 1 << n;
        for (int mask = 0; mask < limit; ++mask) {
            if (Integer.bitCount(mask) != k) continue;
            long sum = 0;
            for (int i = 0; i < n; ++i) {
                if (((mask >>> i) & 1) == 1) sum += arr[i];
            }
            if (sum == target) {
                ArrayList<Integer> s1 = new ArrayList<>(k);
                ArrayList<Integer> s2 = new ArrayList<>(n - k);
                for (int i = 0; i < n; ++i) {
                    if (((mask >>> i) & 1) == 1) s1.add(arr[i]);
                    else s2.add(arr[i]);
                }
                ArrayList<ArrayList<Integer>> res = new ArrayList<>(2);
                res.add(s1);
                res.add(s2);
                return res;
            }
        }
        return new ArrayList<>();
    }
}