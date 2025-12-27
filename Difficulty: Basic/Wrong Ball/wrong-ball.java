class Solution
{
    public int countWrongPlacedBalls(String s)
    {
        int c=0;
        for(int v=0;v<s.length();v++){
            if(s.charAt(v)=='R'&&(v+1)%2==0){
                c++;
            }else if(s.charAt(v)=='B'&&(v+1)%2!=0){
                c++;
            }
        }
        return c;
    }
}