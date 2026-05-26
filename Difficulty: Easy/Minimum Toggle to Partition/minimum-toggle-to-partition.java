class Solution {
    int minToggle(int[] arr) {
        int n = arr.length;
        int totalZeros = 0;
        for (int num : arr) {
            if (num == 0) totalZeros++;
        }
        int leftOnes = 0;
        int rightZeros = totalZeros;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, leftOnes + rightZeros);
            if (arr[i] == 1)
                leftOnes++;
            else
                rightZeros--;
        }
        ans = Math.min(ans, leftOnes + rightZeros);
        return ans;
    }
}