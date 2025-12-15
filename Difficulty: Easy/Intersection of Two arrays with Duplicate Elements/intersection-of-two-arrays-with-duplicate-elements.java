public class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        if (a.length > b.length) return intersect(b, a);
        Set<Integer> setA = new HashSet<>();
        for (int x : a) setA.add(x);
        Set<Integer> inter = new HashSet<>();
        for (int y : b) {
            if (setA.contains(y)) inter.add(y);
        }
        return new ArrayList<>(inter);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] a = {1, 2, 1, 3, 1};
        int[] b = {3, 1, 3, 4, 1};
        ArrayList<Integer> res = sol.intersect(a, b);
        Collections.sort(res);
        System.out.println(res);
    }
}