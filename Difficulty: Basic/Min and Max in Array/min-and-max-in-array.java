class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length-1;
        int min=arr[0];
        int max=arr[n];
        ArrayList<Integer> res=new ArrayList<>();
        res.add(min);
        res.add(max);
        return res;
    }
}