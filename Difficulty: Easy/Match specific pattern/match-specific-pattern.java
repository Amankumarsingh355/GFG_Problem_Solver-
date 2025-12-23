class GfG {
    public static ArrayList<String> findMatchedWords(int n, ArrayList<String> dict,
                                                     String pattern) {
        ArrayList <String> res= new ArrayList<>();
        for(String s:dict){
            Map <Character,Character> map= new HashMap<>();
            Set <Character> charset= new HashSet<>();
            int flag=1;
            if(pattern.length()==s.length()){
                for(int i=0;i<s.length();i++){
                    char val=s.charAt(i);
                    char pat=pattern.charAt(i);
                    if(!map.containsKey(pat) && !charset.contains(val)){
                        charset.add(val);
                        map.put(pat,val);
                    }
                    else{
                        if(map.get(pat)!=val){
                            flag=0;
                            break;
                        }
                    }
                }
                if(flag==1) res.add(s);
            }
        }
        return res;
    }
}