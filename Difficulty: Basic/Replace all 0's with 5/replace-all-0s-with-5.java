class Solution {
    public static int convertFive(int n) {
        int rev = 0;
        int ans = 0;
        while(n!=0){
            int rem = n%10;
            if(rem == 0){
                rem = 5;
            }
            rev = rev * 10+rem;
            n = n/10;
        }
        while(rev != 0){
            int rem = rev%10;
            ans = ans*10+rem;
            rev = rev/10;
        }
        return ans;
    }
}