class Solution {
    int equalSum(int[] arr) {
        if(arr.length ==1) return 0;
        int total = 0;
        for(int i : arr){
            total += i;
        }
        int left = 0;
        
        for(int i = 0;i<arr.length;i++){
            if(i>0){
                   left = left + arr[i-1];
            }
            int x = (total-arr[i])/2;
            if(left == x && (total-(left+arr[i])==x)){
                return i;
            }
            
        }
        return -1;
    }
}