class Solution {
    long MaximumIntegerValue(String S) {
        long l=0;
        for(int v=0;v<S.length();v++){
            long n=S.charAt(v)-'0';
            if(n==0||n==1||l==1){
                l+=n;
            }else{
                if(l==0){
                    l=1;
                }
                l*=n;
            }
        }
        return l;
    }
}