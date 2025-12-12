class Solution {
    int totalCount(int k, int[] arr) {
        int res=0;
        for(int i=0;i<arr.length;i++){
            int noOfDig=0;
            while(arr[i]>=k){
                noOfDig++;
                arr[i]-=k;
            }
            if(arr[i]>0) noOfDig+=1;
            res+=noOfDig;
        }
        return res;
    }
}