class Solution{
    public static int fun(String s, int k, int n, char c)
    {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        count=count*(n/s.length());
        for(int i=0;i<n%s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
}