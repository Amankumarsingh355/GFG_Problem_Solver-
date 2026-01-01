class Solution {
    public double findMedian(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if(n%2!=0) return arr[n/2];
        else {
            int i = n/2;
            int j = n/2+1;
            double sum = (double)(arr[n/2-1]+arr[(n/2)])/2;
            return sum;
        }
    }
}