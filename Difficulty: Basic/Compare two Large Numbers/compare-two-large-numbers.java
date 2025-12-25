class Solution
{
    int check (String a, String b)
    {
        double sum1=Double.parseDouble(a);
        double sum2=Double.parseDouble(b);
        
        if(sum1>sum2){
            return 2;
        }else if(sum1<sum2){
            return 1;
        }else{
            return 3;
        }
    }
}