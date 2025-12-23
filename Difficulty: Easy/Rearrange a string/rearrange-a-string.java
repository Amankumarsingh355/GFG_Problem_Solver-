class Solution
{
    public String arrangeString(String s)
        {
            int num = 0;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(ch >= 'A' && ch <= 'Z'){
                    sb.append(ch);
                }
                if(Character.isDigit(ch)){
                    num = num + (ch-'0');
                }
            }
            char[] charArray = sb.toString().toCharArray();
            Arrays.sort(charArray);
            return new String(charArray) + (num > 0 ? num:"");
        }
}