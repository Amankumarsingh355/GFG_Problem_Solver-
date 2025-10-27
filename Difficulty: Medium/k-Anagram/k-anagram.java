class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        if(s1.length()!=s2.length()) return false;
        int[] arr=new int[26];
        for(char ch:s1.toCharArray()) arr[ch-'a']++;
        for(char ch:s2.toCharArray()) arr[ch-'a']--;
        int ans=0;
        for(int count:arr){
            if(count>0){
                ans+=count;
            }
        }
        return ans<=k;
    }
}