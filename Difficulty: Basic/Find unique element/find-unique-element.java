class Solution {
    public int findUnique(int k, int[] arr) {
        int res=0;
         HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!m.containsKey(arr[i])){
                m.put(arr[i],1);
            }
            else{
                m.put(arr[i],m.get(arr[i])+1);
            }
        }
        for(int i : m.keySet()){
            if(m.get(i)==1){
                
                res = i;

                return res ;
            }
            
        }
        return res;
        
    }
}