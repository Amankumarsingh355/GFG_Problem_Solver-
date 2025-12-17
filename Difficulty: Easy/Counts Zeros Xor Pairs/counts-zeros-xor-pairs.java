class Complete{
    public static long calculate (int arr[], int n) {
        long count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                long sum=arr[i]^arr[j];
                if(sum==0){
                    count++;
                }
            }
        }
        return count;
    }
}