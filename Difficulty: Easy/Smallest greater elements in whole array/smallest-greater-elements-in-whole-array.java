class Complete {
    public static int[] greaterElement (int arr[], int n) {
        int[] temp = Arrays.copyOf(arr,n);
        Arrays.sort(arr);
        for (int i =0;i<n;i++)
        {
            int max = Integer.MAX_VALUE;
            int low = 0,high = arr.length-1;
            while (low<=high)
            {
                int mid = low + (high - low) /2;
                if(arr[mid] > temp[i]){
                    max = Math.min(arr[mid], max);
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            }
            temp[i] = max==Integer.MAX_VALUE?-10000000:max;
        }
        return temp;
    }
}