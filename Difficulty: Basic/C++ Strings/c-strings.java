class Sol {
    String conCat(String s1, String s2) {
        StringBuilder r=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            r.append(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            r.append(s2.charAt(i));
        }
        return r.toString();
    }
}