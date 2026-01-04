class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        ArrayList<Integer>list=new ArrayList<>();
       for(int i=0;i<mat.length;i++){
           for(int j=0;j<mat[i].length;j++){
               list.add(mat[i][j]);
           }
       }
       Collections.sort(list);
       return list;
    }
}