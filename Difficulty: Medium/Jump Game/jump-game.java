class Solution {
    // Function to check if we can reach the last index from the 0th index.
    public boolean canReach(int[] arr) {
        // code here
        int n = arr.length;
        int max = 0;
        for(int i = 0;i<n;i++){
            if(i>max) return false;
            max = Math.max(max,i+arr[i]);
        }
        return true;
    }
}

