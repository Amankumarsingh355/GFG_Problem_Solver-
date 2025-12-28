// User function Template for Java

class Solution {
    static int countCarry(Long A , Long B){
       long carr = 0;
        int c=0;
        while(A>0&&B>0){
            carr = (A%10 + B%10 + carr)/10;
            if(carr==1){
                c++;
            }
            A/=10;
            B/=10;
        }
        if((A!=0||B!=0 )&&carr==1){
            c++;
        }
        return c;
    }
};