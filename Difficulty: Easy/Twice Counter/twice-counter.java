class Solution {
    public int countWords(String list[], int n)
    {
        int ans = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        for(String x : list){
            hm.put(x, hm.getOrDefault(x,0) + 1);
        }
        for(String y : hm.keySet()){
            if(hm.get(y) == 2){
                ans++;
            }
        }
        return ans;
    }
}