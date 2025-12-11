class Solution {
    public static int[] countElements(int a[], int b[], int n, int query[], int q) {
        int arr[] = new int[n];
        for(int i=0;i<query.length;i++){
            int x = query[i];
            int c = 0;
            for(int j=0;j<b.length;j++){
                if(a[x]>=b[j]){
                    c++;
                }
            }
            arr[i] = c;
        }
        return arr;
    }
}