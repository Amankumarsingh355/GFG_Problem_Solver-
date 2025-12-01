import java.util.*;
public class Solution {
    public int maxScore(String s, char[][] jumps) {
        int n = s.length();
        char[] chars = s.toCharArray();
        Map<Character, List<Character>> jumpMap = new HashMap<>();
        for (char[] jump : jumps) {
            if (jump == null || jump.length < 2) continue;
            jumpMap.computeIfAbsent(jump[0], k -> new ArrayList<>()).add(jump[1]);
        }
        Map<Character, List<Integer>> posMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            posMap.computeIfAbsent(chars[i], k -> new ArrayList<>()).add(i);
        }
        Map<Character, long[]> posPrefMap = new HashMap<>();
        Map<Character, int[]> posIndexMap = new HashMap<>();
        for (Map.Entry<Character, List<Integer>> e : posMap.entrySet()) {
            char ch = e.getKey();
            List<Integer> list = e.getValue();
            long[] pref = new long[list.size() + 1];
            int[] idxMap = new int[n];
            for (int i = 0; i < list.size(); i++) {
                pref[i + 1] = pref[i] + chars[list.get(i)];
                idxMap[list.get(i)] = i;
            }
            posPrefMap.put(ch, pref);
            posIndexMap.put(ch, idxMap);
        }
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) prefix[i + 1] = prefix[i] + chars[i];
        Map<Character, long[]> suffMaxMap = new HashMap<>();
        for (Map.Entry<Character, List<Integer>> e : posMap.entrySet()) {
            List<Integer> list = e.getValue();
            long[] suff = new long[list.size()];
            Arrays.fill(suff, Long.MIN_VALUE / 4);
            suffMaxMap.put(e.getKey(), suff);
        }
        long[] dp = new long[n];
        Arrays.fill(dp, 0L);
        for (int i = n - 1; i >= 0; i--) {
            long best = 0L;
            Set<Character> targets = new HashSet<>();
            targets.add(chars[i]);
            List<Character> jm = jumpMap.get(chars[i]);
            if (jm != null) targets.addAll(jm);
            for (char t : targets) {
                List<Integer> tList = posMap.get(t);
                if (tList == null) continue;
                int k = upperBound(tList, i);
                if (k >= tList.size()) continue;
                long[] suff = suffMaxMap.get(t);
                long bestForT = suff[k];
                if (bestForT == Long.MIN_VALUE / 4) continue; 
                int L = lowerBound(tList, i);
                long sumTargetBefore = posPrefMap.get(t)[L];
                long candidate = -prefix[i] + bestForT + sumTargetBefore;
                if (candidate > best) best = candidate;
            }
            dp[i] = best;
            char c = chars[i];
            List<Integer> cList = posMap.get(c);
            int idxInList = posIndexMap.get(c)[i];
            long[] cPref = posPrefMap.get(c);
            long value = prefix[i] - cPref[idxInList] + dp[i];
            long[] cSuff = suffMaxMap.get(c);
            if (idxInList == cSuff.length - 1) {
                cSuff[idxInList] = value;
            } else {
                cSuff[idxInList] = Math.max(value, cSuff[idxInList + 1]);
            }
        }
        return (int) dp[0];
    }
    private static int lowerBound(List<Integer> list, int key) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) >>> 1;
            if (list.get(m) >= key) r = m; else l = m + 1;
        }
        return l;
    }
    private static int upperBound(List<Integer> list, int key) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) >>> 1;
            if (list.get(m) > key) r = m; else l = m + 1;
        }
        return l;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.maxScore("forgfg", new char[][]{{'f','r'},{'r','g'}}));
        System.out.println(sol.maxScore("abcda", new char[][]{{'b','d'}}));
    }
}