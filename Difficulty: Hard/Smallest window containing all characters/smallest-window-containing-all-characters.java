public class Solution {
    public String smallestWindow(String s, String p) {
        if (s == null || p == null) return "";
        int ns = s.length(), np = p.length();
        if (np > ns) return "";
        int[] need = new int[26];
        int requiredTypes = 0;
        for (char ch : p.toCharArray()) {
            int idx = ch - 'a';
            if (need[idx] == 0) requiredTypes++;
            need[idx]++;
        }
        int[] have = new int[26];
        int formed = 0;
        int left = 0, right = 0;
        int bestLen = Integer.MAX_VALUE;
        int bestLeft = 0;
        while (right < ns) {
            int rIdx = s.charAt(right) - 'a';
            have[rIdx]++;
            if (have[rIdx] == need[rIdx] && need[rIdx] > 0) formed++;
            while (left <= right && formed == requiredTypes) {
                int windowLen = right - left + 1;
                if (windowLen < bestLen) {
                    bestLen = windowLen;
                    bestLeft = left;
                }
                int lIdx = s.charAt(left) - 'a';
                have[lIdx]--;
                if (have[lIdx] < need[lIdx] && need[lIdx] > 0) formed--;
                left++;
            }
            right++;
        }
        return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestLeft, bestLeft + bestLen);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.smallestWindow("timetopractice", "toc"));
        System.out.println(sol.smallestWindow("zoomlazapzo", "oza"));
        System.out.println(sol.smallestWindow("zoom", "zooe"));
    }
}