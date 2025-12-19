class Solution {
    public static boolean checkPangram(String s) {
        int[] hash = new int[26];
        if(s.length()<26) return false;
        for(int i=0;i<s.length();i++){
            int a = s.charAt(i) - 'a';
            int b = s.charAt(i) - 'A';
            if(a>=0 && a<=25){
                hash[a]+=1;
            }
            else if(b>=0 && b<=25){
                hash[b]+=1;
            }
        }
        for(int i=0;i<=25;i++){
            if(hash[i]==0){
                return false;
            }
        }
        return true;
    }
}