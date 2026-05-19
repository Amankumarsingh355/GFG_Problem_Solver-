class Solution {
    public long get_Sum(int n, int[] input) {
        // code here
        int val=0;
        for(int i=0; i<input.length; i++){
            val=val+input[i];
        }
        return val;
    }
}