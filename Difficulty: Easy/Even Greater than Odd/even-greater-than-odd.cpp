class Solution {
  public:
    vector<int> rearrangeArray(vector<int>& arr) {
        for(int i=1;i<arr.size();i++){
            int position = i+1;
            if(position%2==0){
                if(arr[i]<arr[i-1])swap(arr[i],arr[i-1]);
            }
            else{
                if(arr[i]>arr[i-1])swap(arr[i],arr[i-1]);
            }
        }
        return arr;
    }
};