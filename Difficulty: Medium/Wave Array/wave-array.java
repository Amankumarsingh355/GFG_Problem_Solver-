public class Solution {
    public void sortInWave(int[] arr) {
        if (arr == null) return;
        for (int i = 0; i + 1 < arr.length; i += 2) {
            int tmp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] arr1 = {1, 2, 3, 4, 5};
        obj.sortInWave(arr1);
        System.out.println(Arrays.toString(arr1)); 

        int[] arr2 = {2, 4, 7, 8, 9, 10};
        obj.sortInWave(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1};
        obj.sortInWave(arr3);
        System.out.println(Arrays.toString(arr3)); 
    }
}