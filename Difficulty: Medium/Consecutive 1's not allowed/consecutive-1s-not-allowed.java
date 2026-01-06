class Solution {
    int countStrings(int n) {
           int zerosend=1;
        int onesend=1;
        int sum=zerosend+onesend;
        if(n==1)return sum;
        for(int i=2;i<=n;i++){
            onesend=zerosend;
            zerosend=sum;
            sum=zerosend+onesend;
        }
        return sum;
    }
}