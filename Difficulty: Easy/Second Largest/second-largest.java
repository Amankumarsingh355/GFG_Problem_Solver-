public class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int second = -1;
        if (arr == null || arr.length == 0) return -1;
        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num < largest) {
                second = num;
            }
        }
        return second;
    }
}