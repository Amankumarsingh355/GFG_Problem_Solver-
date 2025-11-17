class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        int len = arr.length;
        ArrayList <Integer> res = new ArrayList<>();
        Arrays.sort(arr);
        int i =0;
        int j = len-1;
        while(i < j){
            res.add(arr[j]);
            res.add(arr[i]);
            j--;
            i++;
        }
        if(i == j){
            res.add(arr[i]);
        }
    return res;
    }
}