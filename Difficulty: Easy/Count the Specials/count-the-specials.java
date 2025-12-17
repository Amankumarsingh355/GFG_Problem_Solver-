class Solution {
    public int countSpecials(int k, List<Integer> arr) {
        int freq = arr.size() / k;
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x : arr){
            hm.put(x, hm.getOrDefault(x, 0) + 1);    
        }
        for(int y : hm.keySet()){
            if(hm.get(y) == freq){
                ans++;
            }
        }
        return ans;
    }
}