class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=0){
                a.add(arr.get(i));
            }else{
                b.add(arr.get(i));
            }
        }
        arr.clear();
        for(int i=0;i<Math.max(a.size(),b.size());i++){
            if(i<a.size()){
                arr.add(a.get(i));
            }
            if(i<b.size()){
                arr.add(b.get(i));
            }
        }
    }
}