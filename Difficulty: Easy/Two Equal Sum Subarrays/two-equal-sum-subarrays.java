class Solution {
    public boolean canSplit(int arr[]) {
        int t=0;
        for(int num:arr)t+=num;
            if(t%2!=0) return false;
            int half=t/2;
            int curr=0;
            for(int i=0;i<arr.length-1;i++){
                curr+=arr[i];
                if(curr==half)return true;
            }
        return false;
    }
}