class Solution {
    public int[] singleNum(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> result = new ArrayList<>();
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                result.add(i);
            }
        }
        Collections.sort(result);
        return new int[]{result.get(0), result.get(1)};
    }
}
