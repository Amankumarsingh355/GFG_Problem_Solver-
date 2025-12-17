class Solution {
     public static int getMaximum(int N, int[] arr) {
        long sum = 0;
        for(int x : arr){
            sum += x;
        }
        if(sum == 0){
            return N;
        }
        int end = (int)Math.sqrt(sum);
        int max = 1;
        
        for(int i=1; i<=end; i++){
            if(sum % i == 0){
                if(i <= N){
                    max = i;
                }
                if(sum / i <= N){
                 return (int)sum/i;   
                }
            }
        }
        
        return max;
    }
}
