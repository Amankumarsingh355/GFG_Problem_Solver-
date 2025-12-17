class Solution {
     void prank(long[] a, int n)  
    { 
        long[] b = new long[n];
        
        for(int i=0; i<n; i++){
            b[i] = a[i];
        }
        for(int i=0; i<n; i++){
            a[i] = b[(int)a[i]];
        }
    }
}