class Sol {
    Boolean commonSubseq (String a, String b)
    {
        if(a.equals(b)){
            return true;
        }
        for(int i=0; i<b.length(); i++){
            if(a.indexOf(b.charAt(i))>=0)
                return true;
        }
        for(int i=0; i<a.length(); i++){
            if(b.indexOf(a.charAt(i))>=0)
                return true;
        }
        return false;
          
    }
}