class Solution {
    public static int intersectSize(int[] a, int[] b) {
         HashSet<Integer> setA = new HashSet<>();
        for (int num : a) {
            setA.add(num);
        }
        int count = 0;
        for (int num : b) {
            if (setA.contains(num)) {
                count++;
                setA.remove(num);
            }
        }
        return count;
    }
}