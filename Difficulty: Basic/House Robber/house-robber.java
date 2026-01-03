class Solution {
    static int maximizeMoney(int N , int K) {
        if(N%2!=0){
            int rem=N/2;
            return K*(rem+1);
        }
        return K*(N/2);
    }
};