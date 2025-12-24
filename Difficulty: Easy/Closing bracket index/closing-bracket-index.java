class Sol {
    int closing(String s, int pos) {
        if(pos>s.length()) return -1;
        Stack<Character> st=new Stack<>();
        for(int i=pos;i<s.length();i++){
            if(s.charAt(i)=='[' || s.charAt(i)==']'){
                if(s.charAt(i)=='[') st.push(s.charAt(i));
                else if(s.charAt(i)==']') {
                    st.pop();
                    if(st.isEmpty()) return i;
                }
            }
        }
        return -1;
    }
}