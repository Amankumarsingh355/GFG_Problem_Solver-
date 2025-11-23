class Solution {
    static int countPairs(int arr1[], int arr2[], int x) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int l= 0;
        int r = n2-1;
        int count = 0;
        while(l< n1 && r>=0){
            int su = arr1[l] + arr2[r];
            if( su == x){
                count ++;
                l++;
                r--;
            }
            else if( su< x){
                l++;
            }
            else{
                r--;
            }
            
        }
        return count;
    }
}