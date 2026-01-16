class Solution {
  public:
    int checkRedundancy(string s) {
        stack<char> st;
        for(int i=0;i<s.size();i++){
            char ch = s[i];
            if(ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                st.push(ch);
            }
            else{
                bool isRedundant = true;
                if(ch == ')'){
                    while(st.top() != '('){
                        if(st.top() == '+' || st.top() == '-' || 
                        st.top() == '*' || st.top() == '/'){
                            isRedundant = false;
                        }
                        st.pop();
                    }
                    if(isRedundant == true)
                        return 1;
                    st.pop();
                }
            }
        }
        return 0;
    }
};