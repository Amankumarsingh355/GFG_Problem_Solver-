class Solution {
    public int findMissing(int[] arr1, int[] arr2) {
        int xor = 0;
        for(int e:arr1) {
            xor^=e;
        }
        for(int e:arr2) {
            xor^=e;
        }
        return xor;
    }
}