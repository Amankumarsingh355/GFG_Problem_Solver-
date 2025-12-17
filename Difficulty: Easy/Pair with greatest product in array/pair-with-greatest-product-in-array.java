public class Solution {
    public int findGreatest(int[] arr) {
        int n = arr.length;
        if (n == 0) return -1;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int v : arr) freq.put(v, freq.getOrDefault(v, 0) + 1);
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; ++i) a[i] = arr[i];
        Arrays.sort(a, Collections.reverseOrder());
        for (int num : a) {
            int limit = (int) Math.sqrt(num);
            for (int d = 1; d <= limit; ++d) {
                if (num % d != 0) continue;
                int q = num / d;
                if (!freq.containsKey(d) || !freq.containsKey(q)) continue;
                if (d == q) {
                    if (freq.get(d) >= 2) return num;
                } else {
                    if (d == num) {
                        if (freq.get(num) >= 2 && freq.get(q) >= 1) return num;
                    } else if (q == num) {
                        if (freq.get(num) >= 2 && freq.get(d) >= 1) return num;
                    } else {
                        return num;
                    }
                }
            }
        }
        return -1;
    }
}