class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
          int j = 0;
         while(j < arr.length){
         int correctIndex = arr[j] -1;
         if(arr[j] != arr[correctIndex]){
             int temp = arr[j];
             arr[j] = arr[correctIndex];
             arr[correctIndex] = temp;
         }else{
             j++;
         }
     } 
     ArrayList<Integer> list = new ArrayList<>();
     for(int i = 0 ; i < arr.length; i++){
         if(arr[i] != i+1){
             list.add(arr[i]);
             list.add(i+1);
         }
     }
     return list;
    }
}