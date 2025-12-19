class GfG {
    public int remAnagrams(String s1, String s2) {
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        HashMap<Character, Integer> hm= new HashMap<>();
        for(char i: arr1){
              hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(char i: arr2){
           hm.put(i,hm.getOrDefault(i,0)-1);
        }
        int count =0;
        for(Map.Entry<Character,Integer> m: hm.entrySet()){
        count+=Math.abs(m.getValue());
        }return count;
    }
}