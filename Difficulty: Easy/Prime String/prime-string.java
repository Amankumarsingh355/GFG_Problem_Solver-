class Solution {
    public boolean isPrimeString(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=(int)s.charAt(i);
        }
        for(int i=2;i<sum;i++){
            if(sum%i ==0){
                return false;
            }
        }
        return true;
    }
}