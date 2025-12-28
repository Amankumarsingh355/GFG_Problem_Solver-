class Solution {
    public String toggleCase(String s) {
        String m = "";
        char[] k = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            if(k[i]>='a' && k[i]<='z') 
            {
                int r = k[i]-32;
                m+=(char)r;
            }
            else {
                int r = k[i]+32;
                m+=(char)r;
            }
        }
        return m;
    }
}