class Solution {
    int minSubset(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int num:arr){
            sum += num;
        }
        int count = 0;
        Arrays.sort(arr);
        int prevSum = 0;
        for (int i = n-1; i>=0;i--){
            prevSum += arr[i];
           sum -= arr[i];
           count++;
           if(prevSum > sum){
               break;
           }
        }
        return count;
    }
}