class Solution
{
    public boolean decode(String S)
    {
        String s="hello";
        int a=0;
        for(int v=0;v<S.length();v++){
            if(S.charAt(v)==s.charAt(a)){
                a++;
                if(a==5){
                    return true;
                }
            }
        }
        return false;
    }
}