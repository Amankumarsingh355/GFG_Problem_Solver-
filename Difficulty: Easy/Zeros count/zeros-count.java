class Solution {
   static int countZeroes(int[] arr) {
        int count = 0;
        for (int i= 0; i<=arr.length-1; i++ ){
            if(arr[i] == 0)
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        int count = countZeroes(arr);
        System.out.println(count);
    }
}