class Solution {
    static long nthPosition(long n){
        long position = 1;
        while (position <= n) {
            position *= 2; 
        }
        return position / 2; 
    }
}