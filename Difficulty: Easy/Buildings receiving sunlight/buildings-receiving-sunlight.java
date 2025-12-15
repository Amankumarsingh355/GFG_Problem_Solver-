class Solution {
     public static int longest(int arr[]) {
        int ans = 0;
        int max = 0;
        for(int x : arr){
            if(x >= max){
                max = x;
                ans++;
            }
        }
        return ans;
    }
}