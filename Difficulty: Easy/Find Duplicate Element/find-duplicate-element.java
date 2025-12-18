class Solution {
    public int findDuplicate(int arr[]) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>key:map.entrySet()){
            if(key.getValue()>2){
                return key.getKey();
            }
        }
        return -1;
    }
}