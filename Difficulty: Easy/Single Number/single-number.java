class Solution {
    int getSingle(int arr[]) {
         int ans = 0;
    int result = 0;
    for(int num : arr){
        ans = ans^num;
        if(ans != 0){
            result = ans;
        }
    }
    return result;
        
    }
}