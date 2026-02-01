class Solution {
  public:
    vector<int> subarraySum(vector<int> &arr, int target) {
        vector<signed int>ans;
        int left = 0;
        int z=0;
        for(int i = 0;i<arr.size();i++){
                z+=arr[i];
                while(z>target && left<i){
                 z-=arr[left];
                 left++;
                }
                
                if(z == target){
                    ans.push_back(left+1);
                    ans.push_back(i+1);
                    return ans;
                }
        }
        ans.push_back(-1);
        return ans;
    }
};