class Solution
{
    public int penaltyScore(String S)
    {
        int count=0;
        for(int i=0;i<S.length()-1;i++)
        {
            if(S.charAt(i)=='2' && S.charAt(i+1)=='1')
            {
                count++;
            }
        }
        return (count<1) ? 0 : count;
    }   
}