class Solution {
    int ceil(int a, int b) {
        int sum = a / b;
        if(a % b != 0) sum++;
        return sum;
    }
    boolean check(int[] arr, int x, int k) {
        int sum = 0;
        for(int next : arr) {
            sum += ceil(next, x);
        }
        return sum <= k;
    }
    public int kokoEat(int[] arr, int k) {
        int s = 1, e = arr[0];
        for(int next : arr) {
            e = Math.max(e, next);
        }
        int ans = -1;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(check(arr, mid, k)) {
                ans = mid;
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }
        return ans;
    }
}