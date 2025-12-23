class Solution {
    int patternCount(String S) {
        int j=-1;
        int n=S.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(S.charAt(i)=='1')
            {
                if(j!=i-1 && j!=-1)count++;
                j=i;
            }
            else
            {
                if(S.charAt(i)!='0')j=-1;
            }
        }
        return count;
    }
}