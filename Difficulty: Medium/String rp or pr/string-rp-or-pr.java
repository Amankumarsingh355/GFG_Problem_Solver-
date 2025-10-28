class Solution 
{ 
    static long solve(int X,int Y, String S)
{    
    StringBuilder a = new StringBuilder(S);
        if(Y>X){
            int t = Y;
            Y = X;
            X = t;
            a.reverse();
        }
        long ans = 0;
        Stack<Character> s = new Stack<>();
        for(char c : a.toString().toCharArray()){
            if(c=='r'){
                if(s.isEmpty() || s.peek()!='p') s.push(c);
                else{
                    s.pop();
                    ans += X;
                }
            }else if(c=='p'){
                s.push(c);
            }else{
                while(!s.isEmpty() && s.peek()!='p' && s.peek()!='r'){
                    s.pop();
                }
                s.push(c);
            }
        }
        int x = 0,y = 0;
        while(!s.isEmpty()){
            if(s.peek()=='p'){
                y++;
            }else if(s.peek()=='r'){
                x++;
            }else{
                ans += (Y*Math.min(x,y));
                x=y=0;
            }
            s.pop();
        }
        ans += (Y*Math.min(x,y));
        return ans;
}
} 