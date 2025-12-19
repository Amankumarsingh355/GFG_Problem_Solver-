class Solution {
    String modify(String s) {
        Stack<Character> stk=new Stack<>();
        StringBuilder res = new StringBuilder();
        char ch;
        for(char c:s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                stk.push(c);
            }
        }
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                res=res.append(stk.pop());
            }
            else{
                res=res.append(ch);
            }
        }
        return res.toString();
    }
}