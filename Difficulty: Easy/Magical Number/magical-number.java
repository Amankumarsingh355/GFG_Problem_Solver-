class Solution {
    public int findMagicalNumber(int[] arr) {
        int temp = -1;
        int flag = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i){
                temp = i;
                flag =1;
                break;
            }
        }
        if(flag ==1){
            return temp;
        }
        return -1;
    }
}