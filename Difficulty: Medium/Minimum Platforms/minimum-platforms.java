class Solution {
    public int minPlatform(int[] arr, int[] dep) {
        int n = arr == null ? 0 : arr.length;
        if (n == 0) return 0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0;
        int curr = 0, maxPlatforms = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                curr++;
                if (curr > maxPlatforms) maxPlatforms = curr;
                i++;
            } else {
                curr--;
                j++;
            }
        }
        return maxPlatforms;
    }
}