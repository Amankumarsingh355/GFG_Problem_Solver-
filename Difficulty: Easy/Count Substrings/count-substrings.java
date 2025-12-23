class Solution
{
    int countSubstr (String S)
    {
        int count=0;
        for(int i=0;i<S.length();i++)
        {
            char ch1=S.charAt(i);
            if(ch1=='1')
            {
                count++;
            }
        }
         int res=(count*(count-1)/2);
         return res;
    }
} 