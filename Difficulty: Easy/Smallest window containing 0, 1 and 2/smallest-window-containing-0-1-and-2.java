class Solution {
    public int smallestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int zero = 0, one = 0, two = 0;
        int mn = Integer.MAX_VALUE;
        for(int right=0;right<n;right++) {
            char ch = s.charAt(right);
            zero += (ch=='0') ? 1 : 0;
            one += (ch=='1') ? 1 : 0;
            two += (ch=='2') ? 1 : 0;
            while(zero>0 && one>0 && two>0) {
                mn = Math.min(mn, right-left+1);
                char ch2 = s.charAt(left++);
                zero -= (ch2=='0') ? 1 : 0;
                one -= (ch2=='1') ? 1 : 0;
                two -= (ch2=='2') ? 1 : 0;
            }
        }
        return (mn==Integer.MAX_VALUE) ? -1 : mn;
    }
};