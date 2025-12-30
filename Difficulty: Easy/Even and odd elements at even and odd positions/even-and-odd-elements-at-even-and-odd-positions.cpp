class Solution {
  public:
    vector<int> arrangeOddAndEven(vector<int>& a) {
        vector<int>ans;
        vector<int>even,odd;
        int n=a.size();
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even.push_back(a[i]);
            }
            else if(a[i]%2!=0){
                odd.push_back(a[i]);
            }
        }
        int p=0;
        int q=0;
        while(p<n && q<n){
            if(p<even.size()){
                ans.push_back(even[p]);
            }
            if(q<odd.size()){
                ans.push_back(odd[q]);
            }
          p++;
          q++;
    }
    return ans;
    }
};