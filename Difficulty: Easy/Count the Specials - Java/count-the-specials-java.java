class Solution {
    static int countSpecials(int arr[], int k) {
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x : arr){
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        int num = (int) (arr.length / k);
        for(int y : hm.values()){
            if(y == num){
                ans++;
            }
        }
        return ans;
    }
}