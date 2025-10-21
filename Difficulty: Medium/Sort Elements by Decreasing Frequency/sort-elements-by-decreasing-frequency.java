import java.util.*;
public class Solution {
    public ArrayList<Integer> sortByFreq(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        if (arr == null || arr.length == 0) return res;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int v : arr) freq.put(v, freq.getOrDefault(v, 0) + 1);
        List<Integer> vals = new ArrayList<>(freq.keySet());
        vals.sort((a, b) -> {
            int fa = freq.get(a), fb = freq.get(b);
            if (fa != fb) return Integer.compare(fb, fa); 
            return Integer.compare(a, b);});
        for (int v : vals) {
            int count = freq.get(v);
            for (int i = 0; i < count; i++) res.add(v);
        }
        return res;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a1 = {5, 5, 4, 6, 4};
        System.out.println(s.sortByFreq(a1));
        int[] a2 = {9, 9, 9, 2, 5};
        System.out.println(s.sortByFreq(a2));
    }
}