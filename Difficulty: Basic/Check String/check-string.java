class Sol {
    Boolean check(String s) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
       if(set.size()<=1){
          return true;
        }
       else{
          return false;
        }
    }
}