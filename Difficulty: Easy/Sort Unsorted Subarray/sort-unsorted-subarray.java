class Solution {
    public int[] printUnsorted(int[] arr) {
        int[] ans = {0, 0};
        int left = -1, right = -1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                left = i-1;
                break;
            }
        }
        if(left == -1){
            return ans;
        }
        for(int i= arr.length - 2; i>=0; i--){
            if((arr[i] > arr[i+1]) || (arr[i] < arr[left])){
                right = i+1;
                break;
            }
        }
        int min = arr[left];
        int max = arr[right];
        for(int i=left; i<=right; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i=0; i<=left; i++){
            if(arr[i] > min){
                ans[0] = i;
                break;
            }
        }
        for(int i=arr.length-1; i>=right-1; i--){
            if(arr[i] < max){
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}