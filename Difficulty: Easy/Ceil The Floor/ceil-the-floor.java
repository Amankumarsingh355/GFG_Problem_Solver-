class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int floor = -1;
        int ceil = -1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x && ceil == -1) {
                ceil = arr[i];
            }
            if (arr[i] <= x) {
                floor = arr[i];
            }
        }
        return new int[]{floor, ceil};
    }
}