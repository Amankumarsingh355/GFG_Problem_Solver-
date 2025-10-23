public class Solution {
    public int majorityElement(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        int candidate = 0;
        int count = 0;
        for (int x : arr) {
            if (count == 0) {
                candidate = x;
                count = 1;
            } else if (x == candidate) {
                ++count;
            } else {
                --count;
            }
        }
        int freq = 0;
        for (int x : arr) {
            if (x == candidate) ++freq;
        }
        return (freq > arr.length / 2) ? candidate : -1;
    }
}