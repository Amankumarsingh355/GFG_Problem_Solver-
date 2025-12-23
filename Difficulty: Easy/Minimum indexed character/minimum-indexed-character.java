class Solution {
    public static String printMinIndexChar(String S, String patt) {
        int min_index=0;
        ArrayList<Integer> index_str=new ArrayList<>();
        for(int i=0;i<patt.length();i++){
            String str_chr=patt.charAt(i)+"";
            if(S.contains(str_chr)){
                index_str.add(S.indexOf(patt.charAt(i)));
            }
        }
        if(index_str.size()>0){
            Collections.sort(index_str);
            return S.charAt(index_str.get(0))+"";
        }
        return "$";
    }
}