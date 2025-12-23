class Solution {
    static String encryptString(String s) {
        int cnt =1;
        ArrayList<String> li = new ArrayList<>();
        int i=1;
        for( i=1; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cnt++;
            }
            else{
                li.add(Character.toString(s.charAt(i-1)));
                li.add(Integer.toHexString(cnt));
                cnt=1;
            }
        }
            li.add(Character.toString(s.charAt(i-1)));
           li.add(Integer.toHexString(cnt));
           String ans="";
        for(int j=li.size()-1 ; j>=0; j--){
            ans+=li.get(j);
        }
       return ans;
    }
};