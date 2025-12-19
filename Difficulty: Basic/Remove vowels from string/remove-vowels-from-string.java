class Solution {
    String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch!='A'&& ch !='a'&& ch!='E'&& ch !='e'&& ch!='I'&& ch !='i'&& ch!='O'&& ch !='o'&&ch!='U'&& ch !='u')
             sb.append(ch);
        }
        return sb.toString();
    }
}