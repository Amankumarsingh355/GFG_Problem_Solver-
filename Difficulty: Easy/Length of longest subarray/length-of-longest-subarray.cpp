class Solution {
  public:
    int longestSubarry(vector<int>& arr) {
        int ans = 0;
        int len = 0;
        for(int j = 0;j<arr.size();j++){
            if(arr[j]>=0){
                len++;
                ans = max(ans,len);
            }
            else{
                len = 0;
            }
        }
        return ans;
    }
};