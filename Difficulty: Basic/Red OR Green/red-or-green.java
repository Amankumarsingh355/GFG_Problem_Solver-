class Solution {
    static int RedOrGreen(int N, String S) {
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<S.length();i++){
            map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
        }
        int min=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer>key:map.entrySet()){
            min=Math.min(min,key.getValue());
        }
        return S.length()==min?0:min;
    }
}