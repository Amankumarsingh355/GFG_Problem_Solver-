class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
       ArrayList<ArrayList<Integer>> arr= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> newarr= new ArrayList<>();
            for(int j=0;j<=i;j++){
               newarr.add(0);
            }
            arr.add(newarr);
        }
       for(int i=0;i<n;i++){
           for(int j=0;j<=i;j++){
               if(j==0 || i==j){
                   arr.get(i).set(j,1);
               }
               else{
                   arr.get(i).set(j,arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
               }
           }
       }
       return arr.get(n-1);
    }
}