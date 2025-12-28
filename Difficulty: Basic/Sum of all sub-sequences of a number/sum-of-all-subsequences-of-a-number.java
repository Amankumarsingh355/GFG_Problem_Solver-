class Solution {
   int subsequenceSum(String s) {
       int num=0;
    int n=s.length();
    n=n-1;
   double  res=Math.pow(2,n);
    for(int i=0;i<s.length();i++)
    {
         char ch=s.charAt(i);
         int a=ch-'0';
         num+=a*res;
        
    }
    return num;
   }
}