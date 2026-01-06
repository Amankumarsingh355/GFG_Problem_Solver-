class Solution {
    boolean check(int[] arr, int len, int k) {
        int s = 0;
        int e = len - 1;
        while(e < arr.length) {
            int zero = len - (arr[e] - (s > 0 ? arr[s - 1] : 0));
            if(zero <= k) {
                return true;
            }
            s++;
            e++;
        }
        return false;
    }
    public int maxOnes(int arr[], int k) {
        int[] pref = new int[arr.length];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            pref[i] = sum;
        }
        int ans = 0;
        int s = 1;
        int e = arr.length;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(check(pref, mid, k)) {
                ans = mid;
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return ans;
    }
}