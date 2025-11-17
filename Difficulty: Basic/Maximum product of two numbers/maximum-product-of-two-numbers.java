class Solution {
    public static int maxProduct(int[] arr) {
        int n=arr.length;
        int mul=0;
        Arrays.sort(arr);
            mul=arr[n-1]*arr[n-2];
       return mul;
    }
}