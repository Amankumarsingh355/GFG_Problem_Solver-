class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=1;i<=k;i++){
            list.add(arr[arr.length-i]);
        }
        return list;
    }
}