class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        return new ArrayList<>(set);
    }
}