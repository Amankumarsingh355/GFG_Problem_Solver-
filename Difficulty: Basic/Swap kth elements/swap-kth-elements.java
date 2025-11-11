class Solution {
    public void swapKth(List<Integer> arr, int k) {
        Collections.swap(arr,k-1,arr.size() - k);
        
    }
}