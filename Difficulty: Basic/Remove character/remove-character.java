class Solution {
    static String removeChars(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for(char c:str1.toCharArray()){
            boolean ok = false;
            for(char z:str2.toCharArray()){
                if(c==z){
                    ok = true;
                }
            }
            if(!ok){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}