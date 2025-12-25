class Solution{
    static int isSquare(String S)
    {
        int sum=0;
        for(int v=0;v<S.length();v++){
            sum+=(int)S.charAt(v);
        }
        int sq=(int)Math.sqrt(sum);
        if(sq*sq==sum){
            return 1;
        }else{
            return 0;
        }
    }
}