class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
       int n=arr.size();
       for(int i=0;i<n;i++){
           if(arr.get(i)<0){
               continue;
           }
           int temp1=arr.get(arr.get(i));
           
           arr.set(arr.get(i),arr.get(i));
           arr.set(i,temp1);
       }
         for(int i=0;i<n;i++){
           if(arr.get(i)<0){
               continue;
           }
           int temp1=arr.get(arr.get(i));
           arr.set(arr.get(i),arr.get(i));
           arr.set(i,temp1);
       }
       return arr;
    }
}