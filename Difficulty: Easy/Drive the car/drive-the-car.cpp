class Solution {
  public:
    int required(vector<int>& arr, int k)
    {
        sort(arr.begin(),arr.end(),greater<int>());
        int minPetrol=0;
        if(arr[0]>k)
        {
            minPetrol=arr[0]-k;
            return minPetrol;
        }
        else
        {
            return -1;
        }
    }
};