class Solution {
    public int findFloor(int[] arr, int x) {
        int n=arr.length,s=0;
        int l = n-1;
        int mid=(s+l)/2;
        int probAnswer = -1;
        while(s<=l){
            if(arr[mid]<=x){
                probAnswer =  mid;
                s=mid+1;
            }else{
                l=mid-1;
            }
            mid=(s+l)/2;
        }
        return probAnswer;
    }
}