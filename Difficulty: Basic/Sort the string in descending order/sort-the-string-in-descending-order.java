class Solution {
    String ReverseSort(String s) {
int freq[]=new int [26];
for(char ch:s.toCharArray()){
    freq[ch-'a']++;
    
}
StringBuilder res=new StringBuilder();
for(int i=25;i>=0;i--){
    while(freq[i]-->0){
        res.append((char)(i+'a'));
    }
}
return res.toString();
    }
}