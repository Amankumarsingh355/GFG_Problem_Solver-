class Solution {
    public int multiply(int[] arr) {
        int sum=0;
        int sum2=0;
        int n=arr.length;
        int a=n/2;
        for(int i=0;i<a;i++){
            sum+=arr[i];
        }
        for(int i=a;i<arr.length;i++){
            sum2+=arr[i];
        }
        return sum*sum2;
    }
}