class Solution {
    static String sequence(String st){
        int count = 0;
        char element  = st.charAt(0);
        StringBuilder result = new StringBuilder();
        for(int i=0;i<st.length();i++) {
            char ch = st.charAt(i);
            if(ch ==element && count <2) {
                result.append(String.valueOf(ch));
                count++;
            }
            else if(ch!=element && count<=2) {
                result.append(String.valueOf(ch));
                element =ch;
                count = 1;
            }
        }
        return result.toString();
    }
}