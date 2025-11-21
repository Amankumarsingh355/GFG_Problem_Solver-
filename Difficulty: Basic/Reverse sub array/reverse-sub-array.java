class Solution {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,int r) {
        reverse(arr, l -1, r -1);
        return arr;
    }
    public static void reverse(ArrayList<Integer> arr, int start,int end) {
        while(start <= end){
            int temp = arr.get(end);
            arr.set(end, arr.get(start));
            arr.set(start,temp);
            start++;
            end--;
        }
    }
}