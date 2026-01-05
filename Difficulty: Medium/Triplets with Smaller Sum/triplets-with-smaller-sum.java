class Solution {
    long countTriplets(int n, int x, long arr[]) {
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i<n-2; i++){
            int j = i + 1;
            int k = n-1;
            while(j < k){
                long sum = arr[i] + arr[j] + arr[k];
                if(sum < x){
                   count += (k-j);
                   j++;
                }else{
                    k--;
                }
            }
        }
        return count;
    }
}