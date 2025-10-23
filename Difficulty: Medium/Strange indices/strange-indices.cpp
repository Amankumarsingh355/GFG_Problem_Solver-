#include <vector>
#include <climits>
class Solution {
public:
    bool isPossible(int n, int arr[]) {
        if (n < 3) return false;
        std::vector<int> st;
        st.reserve(n);
        int third = INT_MIN;
        for (int i = n - 1; i >= 0; --i) {
            if (arr[i] < third) return true;
            while (!st.empty() && st.back() < arr[i]){
                third = st.back();
                st.pop_back();
            }
            st.push_back(arr[i]);
        }
        return false;
    }
};