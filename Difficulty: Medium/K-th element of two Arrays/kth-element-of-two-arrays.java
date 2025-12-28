class Solution {
    public int kthElement(int a[], int b[], int k) {
        int [] c= new int[a.length+b.length];
        int i=0,j=0;
        int l=0;
        while(i<a.length && j<b.length){
            if (a[i] <= b[j]){
                c[l]=a[i];
                i++;
                l++;
            }
            else{
                c[l]=b[j];
                j++;
                l++;
            }
        }
        while(i<a.length){
            c[l]=a[i];
            i++;
            l++;
        }
        while(j<b.length){
            c[l]=b[j];
            j++;
            l++;
        }
        return c[k-1];
}
}