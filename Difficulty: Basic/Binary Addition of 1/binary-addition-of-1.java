class Solution {
    static String binaryAdd(int n, String s) {
    StringBuilder sb=new StringBuilder();
        int cary=1;
        int v;
        for(v=n-1;v>=0;v--){
            int c=s.charAt(v)-'0';
            if(c+cary==1){
                cary=0;
                sb.insert(0,1);
                break;
            }else if(c+cary==2){
                cary=1;
                sb.insert(0,0);
            }
        }
        if(cary==1){
            sb.insert(0,1);
            return sb.toString();
        }
        v--;
        while(v>=0){
            sb.insert(0,s.charAt(v));
            v--;
        }
        return sb.toString();  
    }
}