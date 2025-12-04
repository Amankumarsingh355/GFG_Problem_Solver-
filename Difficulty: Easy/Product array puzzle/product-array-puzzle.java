class Solution {
    public static int[] productExceptSelf(int arr[]) {
      int n = arr.length;
        int[] res = new int[n];
        int prod = 1;
        boolean flag = false;
        int cnt = 0;
        for(int i = 0; i < n; i++){
             if(arr[i] != 0){
                prod *= arr[i];
             }
             if(arr[i] == 0) {
                 flag = true;
                 cnt++;
             }
        }
        if(flag){
            for(int i = 0; i < n; i++){
                if(arr[i] == 0 && cnt < 2){
                    res[i] = prod;
                }
                else{
                    res[i] = 0;
                }
            }
        }
        else{
       
            for(int i = 0; i < n; i++){
                  res[i] = prod / arr[i]; 
                 
            }
        }
        return res;
    }
}