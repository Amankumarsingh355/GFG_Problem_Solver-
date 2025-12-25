class Solution {
  public:
    string calc_Sum(vector<int>& arr1, vector<int>& arr2) {
        int carry= 0;
        string ans;
        int x;
        int n= arr1.size();
        int m= arr2.size();
        int i= n-1;
        int j= m-1;
    while(i>=0 && j>=0){
        x= arr1[i]+ arr2[j] + carry;
        i--;
        j--;
        int digit= x%10;
        ans.push_back(digit + '0');
        carry = x/ 10;
    }
     while(i>=0 ){
        x= arr1[i]+ 0 + carry;
        i--;
        int digit= x%10;
        ans.push_back(digit + '0');
         carry = x/ 10;
    }
     while(j>=0){
        x= 0+ arr2[j] + carry;
        j--;
        int digit= x%10;
        ans.push_back(digit + '0');
        carry = x/ 10;
    }
    if(carry){
        ans.push_back(carry + '0');
    }
    reverse(ans.begin(),ans.end());
    return ans;
    }
};

