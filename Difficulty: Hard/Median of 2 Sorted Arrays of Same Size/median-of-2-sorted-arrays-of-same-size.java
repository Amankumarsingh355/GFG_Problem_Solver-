class Solution {
    public double medianOf2(int a[], int b[]) {
        int s = a.length;
        int[] arr = new int[2*s];
        for(int i=0;i<s;i++){
            arr[i]=a[i];
        }
        for(int i=0;i<s;i++){
            arr[s+i]=b[i];
        }
        Arrays.sort(arr);
        int mid = arr.length/2;
        double median = (arr[mid-1]+arr[mid])/2.0;
        return median;
    }
}