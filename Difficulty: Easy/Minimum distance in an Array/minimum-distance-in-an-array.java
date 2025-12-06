class Solution {
    int minDist(int arr[], int x, int y) {
        int mn=Integer.MAX_VALUE,index1=-1,index2=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
               index1=i; 
            }
            if(arr[i]==y){
                index2=i;
            }
            if(index1!=-1 && index2!=-1){
                mn=Math.min(mn,Math.abs(index2-index1));
            }
        }
        if(mn==Integer.MAX_VALUE){
            return -1;
        }
        return mn;
    }
}