class Solution {
    static long hashString(String s) {
        String S = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        long sum = 0;
        String z[] = s.split(" ");
        long n = z.length;
        for(String i : z){
            for(int j = 0;j<i.length();j++){
                sum = sum+j+S.indexOf(i.charAt(j));
            }
        }
        return n*sum;
    }
};