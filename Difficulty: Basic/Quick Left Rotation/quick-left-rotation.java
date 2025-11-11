class Solution {
    void leftRotate(int arr[], int k) {
        k = k%arr.length;
        if(k == 0) return;
        int c[] = Arrays.copyOf(arr, arr.length);
        for(int x=0; x<c.length; x++){
            int index = (c.length + x - k) % arr.length ;
            arr[index] = c[x];
        }
    }
}