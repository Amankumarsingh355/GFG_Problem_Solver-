class Solution {
    public static String oddEven(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
        }
        int x=0,y=0;
        for(int i=0;i<26;i++){
            if((i+1)%2!=0){ 
                if(freq[i]%2!=0){
                    y++;
                }
            }
            else{
                if(freq[i]%2==0 && freq[i]!=0){
                    x++;
                }
            }
        }
        return (x+y)%2==1 ? "ODD" : "EVEN";
    }
}
 