class Solution {
    public static int arrayOperations(int n, int[] arr) {
        boolean has_zero = false;
        for(int x : arr){
            if(x == 0){
                has_zero = true;
                break;
            }
        }
        if(!has_zero){
            return -1;
        }
        int flag = 0;
        int ans = 0;
        for(int x : arr){
            if(flag == 0){
                if(x != 0){
                    ans++;
                    flag = 1;
                }
            }
            else{
                if(x == 0){
                    flag = 0;
                }
            }
        }
        return ans;
    }
}