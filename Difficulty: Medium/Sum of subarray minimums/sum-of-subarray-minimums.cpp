class Solution {
  public:
    vector<int> nextse(vector<int>& arr, int n) {
        vector<int> ans(n);
        stack<int> st;
        for (int i=n-1; i>=0; --i) {
            while (!st.empty() && arr[st.top()]>=arr[i]) st.pop();
            ans[i] = st.empty() ? n : st.top();
            st.push(i);
        }
        return ans;
    }
    
    vector<int> prevse(vector<int>& arr, int n) {
        vector<int> ans(n);
        stack<int> st;
        for (int i=0; i<n; ++i) {
            while (!st.empty() && arr[st.top()]>arr[i]) st.pop();
            ans[i] = st.empty() ? -1 : st.top();
            st.push(i);
        }
        return ans;
    }
    int sumSubMins(vector<int> &arr) {
        // code here
        int n = arr.size();
        int tot = 0;
        vector<int> nse = nextse(arr, n);
        vector<int> pse = prevse(arr, n);
        for (int i=0; i<n; ++i) tot += (nse[i]-i)*(i-pse[i])*arr[i];
        
        return tot;
    }
};