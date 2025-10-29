class Solution {
    public String stringFilter(String str) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while( i<str.length()){
            if(str.charAt(i)=='b') {
                i++;
                continue;
            }
            else if(i<str.length()-1 && str.charAt(i)=='a'){
                    if((str.substring(i, i+2)).equals("ac")) {
                        i=i+2;
                        continue;
                    }
                else{
                    sb.append(str.charAt(i));
                }
                }
            else{
                sb.append(str.charAt(i));
            }
            i++;
    }
    return sb.toString();
        }
}