class Solution
{
    boolean isDivisible999(String N)
    {
        double j=Double.parseDouble(N);
        if(j%999==0){
            return true;
        }
        else{
            return false;
        }
    }
}