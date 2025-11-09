class Solution {
     void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 4};
        Solution solution = new Solution();
        solution.printArray(arr);
    }
}