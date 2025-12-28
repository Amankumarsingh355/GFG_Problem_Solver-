class Sol {
    public static String stringSort(String s) {
        char a[] = s.toCharArray();
        Arrays.sort(a);
        List<Character> lower = new ArrayList<>();
        List<Character> upper = new ArrayList<>();
        List<Character> res = new ArrayList<>();
        for(char i : a){
            if(Character.isLowerCase(i)){
                lower.add(i);
            }else{
                upper.add(i);
            }
        }
        int maxSize = Math.max(lower.size(), upper.size());
        for( int j =0;j<maxSize;j++){
            if(j<upper.size()){
                res.add(upper.get(j));
            }
            if(j<lower.size()){
                res.add(lower.get(j));
            }
        }
        StringBuilder sb = new StringBuilder(res.size());
        for(Character ch: res){
            sb.append(ch);
        }
        String result = sb.toString();
        return result;
    }
}