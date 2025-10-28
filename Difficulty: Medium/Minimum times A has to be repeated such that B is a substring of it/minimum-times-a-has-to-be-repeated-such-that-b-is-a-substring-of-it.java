class Solution {
    static int minRepeats(String A, String B) {
        int count=1;
        String aa=A;
        for(int i=0;i<B.length();i++)
        {
            if(A.contains(B))
            {
                return(count);
            }
            else
            {
                A=A+aa;
                count++;
            }
            if(A.length()>2*B.length())
            {
                return(-1);
            }
        }
        return(-1);
    }
};