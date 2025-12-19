class Solution {
    public String reverseWords(String s) {
        String[] a = s.split("\\.+");
        StringBuilder builder = new StringBuilder();
        for(int i=a.length-1; i>=0; i--)
        {
            builder.append(a[i]);
            if(i != 0)
            {
                builder.append(".");
            }
        }
        if(builder.length()>0 && builder.charAt(builder.length()-1)=='.')
        {
            builder.deleteCharAt(builder.length()-1);
        }
        if(builder.length() > 0 && builder.charAt(0) == '.') 
        {
            builder.deleteCharAt(0);
        }
        return builder.toString();
    }
}