class Solution
{
    int kSubstrConcat(int n, String s, int k)
    {
        if(n%k!=0) return 0;
        int idx=n/k;
        for(int i=0;i<k;i++){
            int fre[]=new int[26];
            fre[s.charAt(i)-'a']++;
            for(int j=1;j<idx;j++){
                fre[s.charAt((j*k)+i)-'a']++;
            }
            int max=0;
            for(int ii=0;ii<26;ii++)max=Math.max(max,fre[ii]);
            if(max<idx-1) return 0;
        }
        return 1;
    }
}