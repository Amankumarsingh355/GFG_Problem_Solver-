class Solution {
    public int[] pendulumArrangement(int arr[]) {
        int n = arr.length;
        int e = n%2==0? 1: 0;
        int mid = (n-e)/2;
        Arrays.sort(arr);
        int k=  mid + 1, j = mid - 1;
        int[]res = new int[n];
        res[mid] = arr[0];
        for(int i=1; i<n; i++){
            if(i%2==1){
                res[k++] = arr[i];
            }else{
                res[j--] = arr[i];
            }
        }
        return res;
    }
}