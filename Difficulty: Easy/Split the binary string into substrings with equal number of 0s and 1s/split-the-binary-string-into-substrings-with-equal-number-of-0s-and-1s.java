class Solution {
    public static int maxSubStr(String str) {
        int count0=0;
        int count1=0;
        int ans=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                count1++;
            }
            else{count0++;}
            if(count0==count1 && (count1!=0 || count0!=0)){
                ans++;
            }
        }
        if(count0!=count1){ans=-1;}
        return ans;
    }
}