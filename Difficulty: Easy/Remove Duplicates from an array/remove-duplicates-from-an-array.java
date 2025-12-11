class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
         ArrayList<Integer> list = new  ArrayList<>();
         HashSet<Integer> set =new HashSet<>();
         for(int num:arr){
             if(!set.contains(num)){
                 list.add(num);
                 set.add(num);
             }
         }
        return list;
    }
}