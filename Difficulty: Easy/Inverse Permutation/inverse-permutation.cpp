class Solution {
  public:
    virtual vector<int> inversePermutation(vector<int>& arr) {
      int n = arr.size();
      vector<int> invP(n);
      for(int i=0;i<n;i++){
        invP[arr[i]-1] = i+1;      
      }
      return invP;
    }
};