class Solution
{
    int isRotatedPalindrome(String s)
    {
        for(int i=0;i<s.length();i++){
            String sub=s.substring(i,s.length())+s.substring(0,i);
            if(isPalindrome(sub))return 1;
        }
        return 0;
    }
    boolean isPalindrome(String str)
    {
        int i=0,j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}