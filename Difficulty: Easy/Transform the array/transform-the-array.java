class Solution {
    public ArrayList<Integer> valid(int arr[]) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                if(j>0&&arr[i]==arr[j-1]){
                    arr[j-1] *=2;
                    arr[i]=0;
                }else{
                    arr[j++]=arr[i];
                }
            }
        }
        while(j<arr.length){
            arr[j++]=0;
        }
         ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(num);
        }
        return result;
    }
}