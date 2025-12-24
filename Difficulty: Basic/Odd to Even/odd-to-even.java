class Solution {
    public String makeEven(String s) {
        char ch[]=s.toCharArray();
        int l=s.length();
             int evenLastIndex=l-1;
        for(int i=0;i<l;i++){
            if((ch[i]-'0')%2==0){
                evenLastIndex=i;
                if(ch[i]<ch[l-1])
                    break;
                }
            }
            char temp=ch[l-1];
                   ch[l-1] = ch[evenLastIndex];
            ch[evenLastIndex]=temp;
              String str = String.valueOf(ch);
           return str;
    }
}