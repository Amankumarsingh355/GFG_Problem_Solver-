class Solution {
public:
    bool lemonadeChange(int n, vector<int> &arr) {
        int f5 = 0, f10 = 0;
        if (n == 0) return true;
        if (arr.empty()) return false;
        if (arr[0] == 10 || arr[0] == 20) return false;
        for (int i = 0; i < n; ++i) {
            int bill = arr[i];
            if (bill == 5) {
                ++f5;
            } else if (bill == 10) {
                if (f5 == 0) return false;
                --f5;
                ++f10;
            } else if (bill == 20) {
                if (f10 > 0 && f5 > 0) {
                    --f10;
                    --f5;
                } else if (f5 >= 3) {
                    f5 -= 3;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
    int canServe(vector<int> &arr) {
        return lemonadeChange(static_cast<int>(arr.size()), arr) ? 1 : 0;
    }
};