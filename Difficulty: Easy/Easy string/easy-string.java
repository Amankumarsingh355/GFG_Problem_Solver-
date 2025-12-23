class Solution 
{ 
    String transform(String S) 
    {
        StringBuilder ans = new StringBuilder();
        int count=0;
        Stack<Character> s = new Stack<>();
        for(char c : S.toCharArray()){
            c = Character.toLowerCase(c);
            if(s.isEmpty()){
                s.push(c);
                count=1;
            }else{
                if(c==s.peek()){
                    count++;
                }else{
                    ans.append(count);
                    ans.append(s.pop());
                    count=1;
                    s.push(c);
                }
            }
        }
        ans.append(count);
        ans.append(s.pop());
        return ans.toString();
    }
} 