class Solution {
public:
    vector<int> missinRange(vector<int>& arr, int low, int high) {
         sort(arr.begin(),arr.end());
         vector<int> v;
         int c = -1;
         for(int i = 0;i<arr.size();i++){
             if(arr[i] > low){
                 c = i;
                 break;
             }
             if(arr[i] == low){
                 c = i;
                 break;
             }
         }
         int e = low;
         while(arr[c] > e && e <= high){
            v.push_back(e);
            e++;
         }
         int d = e;
         int i = c;
         while(d<=high && i<arr.size()){
              if(arr[i] == arr[i-1]){
                  i++;
                  continue;
              }
              if(arr[i] == d){
                  d++;
                  i++;
              }
              else{
                 v.push_back(d);
                 d++;
              }
         }
         while(d<=high){
             v.push_back(d);
             d++;
         }
         return v;
    }
};