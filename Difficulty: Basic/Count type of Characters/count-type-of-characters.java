class Sol {
    int[] count(String s) {
        int up=0,lo=0,sp=0,nu=0;
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>='A' &&c[i]<='Z'){
                up++;
            }
            else if(c[i]>='a' && c[i]<='z'){
                lo++;
            }
            else if(c[i]>='0' && c[i]<='9'){
                nu++;
            }
            else{
                sp++;
            }
        }
        return new int[]{up,lo,nu,sp};
    }
}