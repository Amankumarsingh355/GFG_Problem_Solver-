class Solution {
    static int isPossible(int N, int arr[]) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += digitSum(arr[i]);
        }
        if(sum%3==0) return 1;
        return 0;
    }
    static int digitSum(int num) {
        int sum = 0;
        while(num > 0) {
            sum += (num%10);
            num /= 10;
        }
        return sum;
    }
}