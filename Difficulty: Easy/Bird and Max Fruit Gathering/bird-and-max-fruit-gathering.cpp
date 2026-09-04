class Solution {
  public:
    int maxFruits(vector<int>& arr, int m) {
        // code here
        int n =arr.size();
        
        long long windowsum =0;
        
        for(int i=0; i<m ; i++){
            windowsum += arr[i];
            
        }
        long long ans = windowsum;
        
        for (int i=m; i<m+n-1;i++){
            windowsum-=arr[(i-m)%n];
            windowsum +=arr[i%n];
            
            ans = max(ans, windowsum);
        }
        return ans;
    }
};