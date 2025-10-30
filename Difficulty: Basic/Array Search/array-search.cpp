#include <vector>
class Solution {
public:
    int search(const std::vector<int>& arr, int x) {
        for (size_t i = 0; i < arr.size(); ++i) {
            if (arr[i] == x) return static_cast<int>(i);
        }
        return -1;
    }
};