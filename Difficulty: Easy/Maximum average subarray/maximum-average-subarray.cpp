class Solution {
  public:
    int findMaxAverage(int arr[], int n, int k) {
        int start = 0;
        double maxAvg = INT_MIN;
        int startIdx = 0, maxStartIdx = -1;
        double sum = 0;
        for(int i = 0; i< n; i++){
            sum += arr[i];
            if(i - start + 1 > k){
                sum -= arr[start];
                start++;
                startIdx = start;
            }
            if(i - start + 1 == k){
                if(maxAvg < sum / k){
                    maxStartIdx = startIdx;
                    maxAvg = max(maxAvg, sum / k);
                }
            }
        }
        return maxStartIdx;
    }
};