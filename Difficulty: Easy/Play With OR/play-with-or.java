class Solution{
    public static int[] game_with_number (int arr[], int n) {
        int j=0;
        int ans[]=new int[n];
        for(int i=0;i<n-1;i++)
        {
            ans[j]=arr[i]|arr[i+1];
            j++;
        }
        while(j<n)
        {
            ans[j]=arr[n-1];
            j++;
        }
        return ans;
    }
}