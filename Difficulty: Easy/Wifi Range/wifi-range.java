class Solution {
    boolean wifiRange(int N, String S, int X) {
       boolean []seen = new boolean[N];
       Arrays.fill(seen,false);
       for(int i=0;i<N;i++)
       {
           if(S.charAt(i) == '1')
           {
               for(int j = Math.max(0 , i - X); j <= Math.min(i + X , N - 1) ; j++)
               {
                   seen[j] = true;
               }
           }
       }
       for(int i=0;i<N;i++)
       {
           if(!seen[i])
           {
               return false;
           }
       }
       return true;
    }
}