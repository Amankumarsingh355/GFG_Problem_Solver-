class Solution {
    int countPairs(int arr[], int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        int l = 0, r = n-1;
        while(l<r){
            int currSum = arr[l]+arr[r];
            if(currSum<target){
                count += r-l;
                l++;
            }
            else r--;
        }
        return count;
    }
}