class Solution {
    public boolean findTriplet(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int k = n - 1; k >= 0; k--) {
            int i = 0, j = k - 1;
            while (i < j) {
                int sum = arr[i] + arr[j];
                if (sum == arr[k]) {
                    return true;
                } else if (sum < arr[k]) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return false;
}
};