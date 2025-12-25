class Solution 
{ 
    int minManipulation(int N, String S1, String S2)
    {
        int[]f=new int[26];
        for(int i=0;i<N;i++){
            char ch=S1.charAt(i);
            f[ch-'a']++;
        }
        for(int i=0;i<N;i++){
            char ch=S2.charAt(i);
            f[ch-'a']--;
        }
        int ans=0;
        for(int i=0;i<26;i++){
            ans+=Math.abs(f[i]);
        }
        return ans>0?ans/2:ans;
    }
}