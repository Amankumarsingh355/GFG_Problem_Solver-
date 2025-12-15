class Solution {
    int upperBound(int[] arr, int target) {
        int size = arr.length;
        int low=0,high=size-1,mid=(low+high)/2;
        int ans = size;
        while(low<=high){
            if(arr[mid] <= target) low = mid+1;
            else if(arr[mid] > target){
                ans = mid;
                high = mid-1;
            }
            mid=(low+high)/2;
        }
        return ans;
    }
}