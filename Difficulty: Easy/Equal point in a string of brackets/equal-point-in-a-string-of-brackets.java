class Solution {
   public long countSub(String str) {
        long open=0;
        for(char c : str.toCharArray())
        {
            if(c == '(') open++;
        }
        long close=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(close == open) return i+1;
            if(str.charAt(i) == '(') open--;
            if(str.charAt(i) == ')') close++;
        }
       return 0;
    }
}