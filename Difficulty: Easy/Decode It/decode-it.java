class Solution {
    static char decodeIt(String str,int k){
        StringBuilder s = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                s.append(c);
            }else{
                int n  = c - '0';
                String t = s.toString();
                while(n>1){
                    s.append(t);
                    n--;
                    
                }
                
            }
        }
        return s.toString().charAt(k-1);
    }
}