class Solution {
    public String maximumFrequency(String str) {
        LinkedHashMap<String,Integer> maps=new LinkedHashMap<>();
        String[] list=str.split(" ");
        int max=1;
        String maxi=list[0];
        for(int i=0;i<list.length;i++){
            maps.put(list[i],maps.getOrDefault(list[i],0)+1);
        }
        for(Map.Entry<String,Integer> map:maps.entrySet()){
             if(map.getValue()>max){
                max=map.getValue();
                maxi=map.getKey();
            }
        }
        return maxi +" "+max;
    }
}