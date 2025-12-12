class Solution {
    public long maxSum(Long[] arr) {
        int i, j;
        int n = arr.length;
        Arrays.sort(arr);
        i = 0;
        j = n-1;
        long sum = 0;
        int flag = 0;
        while(i < j){
            sum += Math.abs(arr[i] - arr[j]);
            if(flag == 0){
                i++;
            }
            else{
                j--;
            }
            flag = 1 - flag;
        }
        sum += Math.abs(arr[0] - arr[i]);
        return sum;
    }
}