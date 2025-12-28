class Solution {
    public String remove3ConsecutiveDuplicates(String S) {
        boolean j=true;
        while(j)
        {
            j=false;
            for(int i=0; i<=S.length()-3;i++)
            {
                char ch1=S.charAt(i);
                char ch2=S.charAt(i+1);
                char ch3=S.charAt(i+2);
                if (ch1==ch2 && ch1==ch3)
                {
                    S=S.substring(0,i)+S.substring(i+3);
                    j=true;
                    break;
                }
            }
        }
        if(S.length()==0)
            return "-1";
        return S;
    }
}