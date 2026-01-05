class Solution {
public:
    int getChocolateCost(vector<int> arr, int chocolateMrp)
    {
           int a = *max_element(arr.begin(),arr.end());
           return a*chocolateMrp;
    }
};