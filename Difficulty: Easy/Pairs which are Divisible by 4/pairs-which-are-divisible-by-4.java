class Solution {
    public static int count4Divisibiles(int arr[]) {
        int cnt = 0;
        int cnt_zero = 0, cnt_one = 0, cnt_two = 0, cnt_three = 0;
        for(int x : arr){
            if(x % 4 == 0){
                cnt_zero++;
            }else if(x % 4 == 1){
                cnt_one++;
            }else if(x % 4 == 2){
                cnt_two++;
            }else if(x % 4 == 3){
                cnt_three++;
            }
        }
        cnt += cnt_zero * (cnt_zero-1)/2;
        cnt += cnt_one * cnt_three;
        cnt += cnt_two * (cnt_two-1)/2;
        return cnt;
    }
}