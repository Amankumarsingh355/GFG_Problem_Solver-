class Solution
{
    String gameResult(String s)
    {
        char c=s.charAt(0);
        char c1=s.charAt(1);
        if(c==c1){
            return "DRAW";
        }else if((c=='S' && c1=='R')||(c=='P'&& c1=='S')||(c=='R'&& c1=='P')){
            return "B";
        }else{
            return "A";
        }
    }
}