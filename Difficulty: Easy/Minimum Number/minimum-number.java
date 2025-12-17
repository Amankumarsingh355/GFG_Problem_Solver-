class Solution {
    public static int minimumNumber(int n, int[] arr) {
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = gcd(result, arr[i]);
            
            if (result == 1) {
                return 1;
            }
        }
        return result;
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}