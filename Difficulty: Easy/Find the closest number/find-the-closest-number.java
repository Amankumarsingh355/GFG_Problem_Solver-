class Solution {
    public static int findClosest(int[] arr, int k) {
        int l = 0;
        int n = arr.length;
        int r = n-1;
        int ans = -1;
        int abs = Integer.MAX_VALUE;
        while(l<=r) {
            int mid = (l+r)/2;
            if(abs == Math.abs(arr[mid] - k) && ans < arr[mid]) {
                abs = Math.abs(arr[mid] - k);
                ans = arr[mid];
            } else if(abs > Math.abs(arr[mid] - k)) {
                abs = Math.abs(arr[mid] - k);
                ans = arr[mid];    
            }          
            if(arr[mid] >= k) {
                r= mid - 1;
            } else {
                l = mid +1;
            }
        }
        return ans;
    }
}