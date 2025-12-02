class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        TreeSet<Integer> list = new TreeSet<>();
        for(int i = 0; i<a.length; i++ ){
            list.add(a[i]);
        }
            for(int j = 0; j<b.length;j++){
            list.add(b[j]);
            }
        ArrayList<Integer>Union = new ArrayList<>(list);
        return Union;
    }
}