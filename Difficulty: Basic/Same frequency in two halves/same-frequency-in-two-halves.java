class Solution
{
    static boolean check(int h,String s,int[] f){
        for(int v=h;v<s.length();v++){
                f[s.charAt(v)-'a']--;
        }
        for(int v=0;v<26;v++){
            if(f[v]>0){
                return false;
            }
        }
        return true;
    }
    boolean passed(String s)
    {
        int[] f=new int[26];
        int h=s.length()/2;
        
        for(int v=0;v<h;v++){
            f[s.charAt(v)-'a']++;
        }
        if(s.length()%2==0){
            return check(h,s,f);
        }else{
            h=h+1;
            return check(h,s,f);
        }
    }
}