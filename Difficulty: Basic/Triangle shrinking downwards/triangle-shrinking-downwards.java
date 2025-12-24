class Solution {
    static String triDownwards(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++) {
            for(int j=0;j<i;j++)
                str.append('.');
            for(int j=i;j<s.length();j++)
                str.append(s.charAt(j));
        }
        return str.toString();
    }
};