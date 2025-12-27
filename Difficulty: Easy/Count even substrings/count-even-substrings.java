class Solution {
    static long evenNumSubstring(String s)
    {
        long count=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i) - '0')%2==0){
                count+=i +1;
            }
        }
        return count;
    }
}