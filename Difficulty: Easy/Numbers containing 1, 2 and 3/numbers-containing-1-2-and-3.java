class Solution {
    public ArrayList<Integer> filterByDigits(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        for (int i:arr){
            ArrayList<Character>set=new ArrayList<>();
            boolean b=false;
            for (char j:String.valueOf(i).toCharArray()){
                if (j=='1'||j=='2'||j=='3'){
                    set.add(j);
                    b=true;
                }else {
                    b=false;
                    break;
                }
            }
            if (set.contains('1')||set.contains('2')||set.contains('3')){
                if (b){
                    list.add(i);
                }
            }
        }
        return list;
        
    }
}