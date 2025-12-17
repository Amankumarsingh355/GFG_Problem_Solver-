class Solution {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
            int min = Integer.MAX_VALUE; 
        for(int i = 0; i < N; i++) {
            int currentTime = Math.abs(pos[i] - cur) * time[i];
            if(currentTime < min) {
                min = currentTime;
            }
        }
        return min;
    }
}