class Solution {
    long max_Books(int arr[], int n, int k) {
        long sumi = 0;
        long maxi = 0;
        for(int i = 0;i < n; i++)
        {
            if(arr[i] <= k)
                sumi += arr[i];
            else
                sumi = 0;
            if(maxi < sumi)
                maxi = sumi;
        }
        return maxi;
    }
}