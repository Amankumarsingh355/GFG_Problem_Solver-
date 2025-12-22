class Sol {
    int countCamelCase(String s) {
        if(s.length() == 0)
        {
            return -1;
        }
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) >= 65 && s.charAt(i) <=90)
            {
                count++;
            }
        }
        return count;
    }
}