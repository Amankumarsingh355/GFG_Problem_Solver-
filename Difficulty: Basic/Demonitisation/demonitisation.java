class Solution {
    static String demonitize(String S, String m, String n) {
        String str = S;
        if(S.contains(m)){
            S = S.replace(m,"");
        }
        if(S.contains(n)){
            S = S.replace(n,"");
        }else{
            if(str.contains(n)){
                return "-1";
            }
        }
        if(S.length() ==0){
            return "-1";
        }
        return S;
    }
};