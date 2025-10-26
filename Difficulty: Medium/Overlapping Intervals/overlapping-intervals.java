public class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<>();
        if (intervals == null || intervals.length == 0) return res;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int curS = intervals[0][0], curE = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int s = intervals[i][0], e = intervals[i][1];
            if (s <= curE) curE = Math.max(curE, e);
            else { res.add(new int[]{curS, curE}); curS = s; curE = e; }
        }
        res.add(new int[]{curS, curE});
        return res;
    }
    public static void main(String[] args) {
        int[][] arr = {{6,8},{1,9},{2,4},{4,7}};
        Solution sol = new Solution();
        ArrayList<int[]> ans = sol.mergeOverlap(arr);
        for (int[] it : ans) System.out.println("[" + it[0] + ", " + it[1] + "]");
    }
}