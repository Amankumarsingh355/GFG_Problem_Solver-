class Solution {
    public long firstIndex(int arr[]) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                int result=arr[i]^0;
                if(result==1){
                    return i;
                }
                else{
                return -1;
                }
            }
        }
        return -1;
    }
}