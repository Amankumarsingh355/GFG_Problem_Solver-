class Solution {
    public String is_common(String[] s, String[] t) {
        HashSet<String> hm=new HashSet<>(Arrays.asList(s));
        for(String item:t){
            if(hm.contains(item)) return "CHANGE";
        }
        return "BEHAPPY";
    }
}