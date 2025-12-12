class Solution {
    int countPairs(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int sum=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            int cur=entry.getKey();
            int val=cur+k;
            if (map.containsKey(val)){
                sum+=(map.get(val)*map.get(cur));
            }
        }
        return sum;
    }
}

