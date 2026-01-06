class Solution {
    public static int closestToZero(int arr[], int n) {
        if (arr == null || n < 2) {
            return 0;
        }
        Arrays.sort(arr);
        int i = 0, j = n - 1;
        int bestSum = Integer.MAX_VALUE;
        int bestAbs = Integer.MAX_VALUE;
        while (i < j) {
            int rawSum = arr[i] + arr[j];
            int absSum = Math.abs(rawSum);
            if (absSum < bestAbs || (absSum == bestAbs && rawSum > bestSum)) {
                bestAbs = absSum;
                bestSum = rawSum;
            }
            if (rawSum < 0) {
                i++;
            } else if (rawSum > 0) {
                j--;
            } else {
                return 0;
            }
        }
        return bestSum;
    }
}