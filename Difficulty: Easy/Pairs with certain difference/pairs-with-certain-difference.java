class Solution {
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) 
    {
        Arrays.sort(arr);
        int count = 0;
        for(int i = N-1; i>=0;)
        {
            if(i-1 >=0 && arr[i] - arr[i-1] < K)
            {
                count = count + arr[i] + arr[i-1];
                 i = i-2;
            }
            else
            {
                i--;
            }
        }
        return count;
    }
}