class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=0 && arr[i+1]!=0){
                if(arr[i]==arr[i+1]){
                    arr[i]*=2;
                    arr[i+1]=0;
                }
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        int k=0;
        for(int x:arr){
            if(x!=0){
                res.add(x);
                k++;
            }
        }
        for(int i=k;i<arr.length;i++){
            res.add(0);
        }
        return res;
    }
}