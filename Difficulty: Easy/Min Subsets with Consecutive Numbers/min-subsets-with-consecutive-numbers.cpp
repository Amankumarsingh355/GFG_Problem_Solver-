class Solution {
  public:
    int numOfSubset(vector<int> &arr) {
        sort(arr.begin(),arr.end());
        int count=0;
        for(int i=0;i<arr.size()-1;i++)
            count+=(arr[i+1]-arr[i]==1)?0:1;
        return count+1;
    }
};