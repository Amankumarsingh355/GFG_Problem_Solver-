class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        int n=arr.length;
        List<Integer>list = new ArrayList<>(Collections.nCopies(n, 0));
        for(int i=0;i<arr.length;i++){
            int value=arr[i];
           int count = list.get(value - 1);
            list.set(value-1,count+1);
        }
        return list;
    }
}