class Solution 
{ 
    String ExtractMessage(String S) 
    { 
        StringBuilder sb=new StringBuilder();
        S=S.replace("LIE"," ");
        boolean b=false;
        for(int v=0;v<S.length();v++){
            char c=S.charAt(v);
            if(c!=' '){
                if(b&&sb.length()>0){
                    sb.append(" ");
                }
                b=false;
                sb.append(c);
            }else{
                b=true;
            }
        }
        return sb.toString();
    }
} 