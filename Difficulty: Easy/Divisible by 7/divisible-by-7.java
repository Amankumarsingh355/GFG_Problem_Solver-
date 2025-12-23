class Solution {
    int isdivisible7(String num) {
        int n = num.length();
        int check =0;
        for(int i=0; i<n; i++){
            check = (check*10) +(num.charAt(i)-'0');
            check %= 7;
        }
        return (check==0) ?1:0;
    }
}