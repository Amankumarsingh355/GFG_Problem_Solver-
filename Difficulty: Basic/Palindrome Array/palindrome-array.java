class Solution {
    public static boolean isPerfect(int[] arr) {
        int[] temp=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            temp[j]=arr[i];
            j++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=temp[i]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,1,2};
        System.out.print(isPerfect(arr));
    }
}