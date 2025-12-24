class Solution {
    static int Count(String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                count++;
            }
        }
        return count;
    }
}