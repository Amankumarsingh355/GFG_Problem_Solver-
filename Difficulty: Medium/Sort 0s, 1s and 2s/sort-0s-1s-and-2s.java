class Solution {
    public void sort012(int[] arr) {
        int i=0;
        int j=0;
        while( j<arr.length)
        {  
            if(arr[j]==0 )
            {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            }
            j++;
        }
        j=i;
        while( j<arr.length)        
        {  
            if(arr[j]==1 )
            {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            }
            j++;
        }
        
    }
}