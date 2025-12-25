class Solution 
{ 
    String multiplyby11(String number) 
    { 
        int n=number.length();
        StringBuilder str=new StringBuilder();
        int carry=0;
        for(int i=n-1;i>=0;i--){
            int sum=carry;
            sum+=(number.charAt(i)-'0')*11;
            if(i==0){
                str.reverse();
                return sum+str.toString();
            }
            str.append(sum%10);
            carry=sum/10;
        }
        return "0";
    }
}