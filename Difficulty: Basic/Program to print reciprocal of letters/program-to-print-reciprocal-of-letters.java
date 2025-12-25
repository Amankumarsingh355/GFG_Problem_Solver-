class Solution{
    static String reciprocalString(String S){
        StringBuilder sb=new StringBuilder();
        for(int v=0;v<S.length();v++){
            int val=S.charAt(v);
            if(val>=97&&val<=122){
                char c=(char)(122-(val-'a'));
                sb.append(c);
            }else if(S.charAt(v)==' '){
                sb.append(' ');
            }
            else{
                char c=(char)(90-(val-'A'));
                sb.append(c);
            }
        }
        return sb.toString();
    }
}