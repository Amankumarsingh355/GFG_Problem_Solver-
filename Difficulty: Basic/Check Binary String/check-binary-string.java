class Sol {
    Boolean checkBinary(String s) {
        boolean open=false;
         boolean flag=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='1' && !open) open=true;
           else if(c=='0' && open) flag=true;
            else if(c=='1' && flag) return false;
        }
        return true;
    }
}