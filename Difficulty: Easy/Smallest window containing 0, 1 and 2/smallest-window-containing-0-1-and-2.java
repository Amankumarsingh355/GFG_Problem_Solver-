class Solution {
    public int smallestSubstring(String s) {
        int n = s.length();
        int ans = Integer.MAX_VALUE;
        int count0 = 0, count1 = 0, count2 = 0;
        int l = 0;
        for (int r = 0; r < n; r++) {
            char c = s.charAt(r);
            if (c == '0') count0++;
            else if (c == '1') count1++;
            else if (c == '2') count2++;
            while (count0 > 0 && count1 > 0 && count2 > 0) {
                ans = Math.min(ans, r - l + 1);
                char leftChar = s.charAt(l);
                if (leftChar == '0') count0--;
                else if (leftChar == '1') count1--;
                else count2--;
                l++;
            }
        }
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}