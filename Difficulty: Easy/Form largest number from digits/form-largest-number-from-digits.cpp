class Solution {
  public:
    string MaxNumber(vector<int>& arr) {
        sort(arr.begin(),arr.end());
        string ans;
        for(int i = arr.size()-1;i>=0;i--){
            ans += arr[i]+'0';
        }
        return ans;
    }
};