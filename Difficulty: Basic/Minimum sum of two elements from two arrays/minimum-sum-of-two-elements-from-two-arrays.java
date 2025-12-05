public class Solution {
    public int minSum(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int INF = Integer.MAX_VALUE / 4;
        int min1Val = INF, min1Idx = -1, min1SecondVal = INF;
        int min2Val = INF, min2Idx = -1, min2SecondVal = INF;
        for (int i = 0; i < n; ++i) {
            int v = arr1[i];
            if (v < min1Val) {
                min1SecondVal = min1Val;
                min1Val = v;
                min1Idx = i;
            } else if (v < min1SecondVal) {
                min1SecondVal = v;
            }
            int w = arr2[i];
            if (w < min2Val) {
                min2SecondVal = min2Val;
                min2Val = w;
                min2Idx = i;
            } else if (w < min2SecondVal) {
                min2SecondVal = w;
            }
        }
        if (min1Idx != min2Idx) {
            return min1Val + min2Val;
        } else {
            int option1 = (min2SecondVal == INF) ? INF : min1Val + min2SecondVal;
            int option2 = (min1SecondVal == INF) ? INF : min1SecondVal + min2Val;
            return Math.min(option1, option2);
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {5, 4, 13, 2, 1};
        int[] arr2 = {2, 3, 4, 6, 5};
        System.out.println(solution.minSum(arr1, arr2));
        int[] a2 = {5, 4, 13, 1};
        int[] b2 = {3, 2, 6, 1};
        System.out.println(solution.minSum(a2, b2));
    }
}