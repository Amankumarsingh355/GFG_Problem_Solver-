class Solution
{
    public String isCircular(String s)
    {
        int x=0,y=0,dir=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='R'){dir=(dir+1)%4;}
            else if(ch=='L'){dir=(4+dir-1)%4;}
            else{
                if(dir==0)y++;
                else if(dir==1)x++;
                else if(dir==2)y--;
                else x--;
            }
        }
            return(x==0 && y==0)?"Circular":"Not Circular";
    }
}