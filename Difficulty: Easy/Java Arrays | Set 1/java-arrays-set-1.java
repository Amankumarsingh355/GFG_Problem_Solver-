class Solution {
    public String average(int arr[]) {
        int n = arr.length;
        int s = 0;
        for(int i=0;i<n;i++){
            s += arr[i];
        }
        double c = (double)s/n;
        return String.format("%.2f",c);
    }
}