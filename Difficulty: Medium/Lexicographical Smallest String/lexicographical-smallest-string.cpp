#include <bits/stdc++.h>
using namespace std;
string lexicographicalSmallestString(string& s) {
    int n = s.size();
    for (int L = 1; ; ++L) {
        unordered_set<string> seen;
        if (L <= n) {
            for (int i = 0; i + L <= n; ++i) {
                seen.insert(s.substr(i, L));
            }
        }
        string cur;
        function<bool(int)> dfs = [&](int depth) -> bool {
            if (depth == L) {
                if (seen.find(cur) == seen.end()) return true;
                return false;
            }
            for (char c = 'a'; c <= 'z'; ++c) {
                cur.push_back(c);
                if (dfs(depth + 1)) return true;
                cur.pop_back();
            }
            return false;
        };
        if (dfs(0)) return cur;
    }
    return string();
}