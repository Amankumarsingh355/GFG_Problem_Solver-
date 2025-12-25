class Sol {
    int divisibleBy11(String S) {
        int r=0;
        for(int i=0;i<S.length();i++)
            r=((r*10)+(S.charAt(i)-'0'))%11;
        return r==0?1:0;
    }
}