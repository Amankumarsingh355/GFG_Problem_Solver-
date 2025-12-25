class Solution {
    static boolean check_duck(String N) {
        // code here
        if(N.lastIndexOf("0")==-1 || N.lastIndexOf("0")==0)
            return false;
        for(int i=0;i<N.lastIndexOf("0");i++){
            if(N.charAt(i)!='0')
                return true;
        }
        return false;
    }
}