class Solution {
    public static ArrayList<Integer> subsetXOR(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int mod = n % 4;
        int skip = -1;
        if (mod == 0) {
            skip = -1;
        } else if (mod == 3) {
            skip = n;
        } else if (mod == 2) {
            skip = 1;
        } else {
            if (n == 1) skip = -1;
            else skip = n - 1;
        }
        for (int i = 1; i <= n; i++) {
            if (i == skip) continue;
            ans.add(i);
        }
        return ans;
    }
}