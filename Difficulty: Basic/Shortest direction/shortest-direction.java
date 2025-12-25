class Solution {
    String shortestPath(String S) {
        int n=0,s=0,e=0,w=0;
        for(char ch:S.toCharArray()){
            if(ch=='N') n++;
           else  if(ch=='W') w++;
            else if(ch=='E') e++;
            else if(ch=='S') s++;
        }
        int v=n-s;
        int h=e-w;
        StringBuilder sb=new StringBuilder();
         if(h>0){
             sb.append("E".repeat(h));
         }
         if(v>0){
             sb.append("N".repeat(v));
         }
         if(v<0){
             sb.append("S".repeat(Math.abs(v)));
         }
         if(h<0){
             sb.append("W".repeat(Math.abs(h)));
         }
         return sb.toString();
        
    }
}