class Solution {
     int countSubstring(String S) 
    {
      HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<S.length();i++){
            if(Character.isLowerCase(S.charAt(i))){
                sum-=1;
            }else{
                sum+=1;
           } if(map.containsKey(sum)){

                count+=map.get(sum);
            }
                map.put(sum,map.getOrDefault(sum,0)+1);
            
        }
        return count;
    }
}
