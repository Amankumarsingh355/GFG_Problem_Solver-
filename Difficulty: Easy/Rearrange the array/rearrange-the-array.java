class Solution {
    public void rearrangeArray(int arr[]) {
        Arrays.sort(arr);
        int n=arr.length;
        int[] result= new int[n];
        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                result[i]=arr[left++];
            }else{
                result[i]=arr[right--];
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }
}
