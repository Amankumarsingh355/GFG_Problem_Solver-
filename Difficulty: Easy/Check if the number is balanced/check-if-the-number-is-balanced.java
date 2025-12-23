class Sol
{
    Boolean balancedNumber(String N)
    {
        int n=N.length();
        int sum=0;
        for(int i=0,j=n-1;i<n/2&&j>n/2;i++,j--){
            sum=sum+N.charAt(i)-N.charAt(j);
        }
        return sum==0;
    }
}