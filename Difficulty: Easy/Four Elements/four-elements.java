class Compute
{
    boolean find4Numbers(int A[], int n, int X) 
    {
        Arrays.sort(A);
        for(int i=0;i<n-3;i++)
        {
            int j=i+1;
            int l=i+2;
            int k=n-1;
            while(j<k && l<k)
            {
                int sum=A[i]+A[j]+A[k]+A[l];
                if(sum==X)
                {
                    return true;
                }
                else if(sum>X)
                {
                    k--;
                }
                else
                {
                    l++;
                }
            }
        }
        return false;
    }
}