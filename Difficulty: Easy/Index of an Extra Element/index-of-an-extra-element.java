class Solution {
    public int findExtra(int a[], int b[]) {
        int j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i] != b[j++]){
                return i;
            }
        }
        return a.length-1;
    }
}