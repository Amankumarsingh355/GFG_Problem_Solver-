class Solution {
    public char nonRepeatingChar(String s) {
        Map<Character,Integer> map1=new HashMap<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            int  freq=map1.getOrDefault(ch[i],0);
            map1.put(ch[i],freq+1);
        }
        for(int i=0;i<s.length();i++){
            if(map1.get(ch[i])==1){
                return ch[i];
            }
        }
        return '$';
    }
}