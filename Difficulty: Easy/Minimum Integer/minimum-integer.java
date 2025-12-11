class Solution {
    public static int minimumInteger(int N, int[] A) {
        long sum=0;
        int min1=Integer.MAX_VALUE;
        for(int value:A)
        {
            sum=sum+value;
        }
        for(int Value:A)
        {
            long h=(long) Value*N;
            if(sum<=h)
            {
                if(min1>Value)
                {
                    min1=Value;
                }
            }
        }
        return min1;
    }
}