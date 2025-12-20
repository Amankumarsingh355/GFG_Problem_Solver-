class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        int shortest = Integer.MAX_VALUE;
        int index1 = -1;
        int index2 = -1;
        for(int i=0;i<s.size();i++){
            String str = s.get(i);
            if(str.equals(word1)){
                index1 = i;
            }
            if(str.equals(word2)){
                index2  = i;
            }
            if(index1 != -1 && index2 != -1){
                int distance = Math.abs(index1 - index2);
                shortest = distance < shortest ? distance : shortest;
            }
        }
        return shortest;
    }
}