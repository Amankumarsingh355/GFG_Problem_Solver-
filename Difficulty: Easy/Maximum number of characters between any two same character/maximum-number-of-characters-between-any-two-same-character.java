class Solution {
    public int maxChars(String s) {
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int dis = s.lastIndexOf(c) - s.indexOf(c) - 1;
            if (dis > max) max = dis;         }
        return max;
    }
}