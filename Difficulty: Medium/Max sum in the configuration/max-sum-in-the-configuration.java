class Solution {
    int maxSum(int[] arr) {
        int sum=0,s0=0;
        for(int i=0;i<arr.length;i++){
            s0+=i*arr[i];
            sum+=arr[i];
        }
        int max=s0;
        int p=s0;
        for(int i=0;i<arr.length-1;i++){
            int s=(p+sum)-(arr.length*arr[arr.length-i-1]);
            max=Integer.max(max,s);
            p=s;
        }
        return max;
    }
}