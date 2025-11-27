class Solution {
        public boolean checkIsAP(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int diff = Math.abs(arr[0]-arr[1]);
        for(int i=0; i<n-1; i++){
            if(Math.abs(arr[i]-arr[i+1])!=diff) return false;
        }
        return true;
    }
}