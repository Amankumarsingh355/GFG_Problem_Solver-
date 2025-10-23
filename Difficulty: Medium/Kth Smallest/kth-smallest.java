public class Solution {
    private static final Random RAND = new Random();
    public int kthSmallest(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k < 1 || k > arr.length)
            throw new IllegalArgumentException("Invalid input");
        return quickSelect(arr, 0, arr.length - 1, k - 1);
    }
    private int quickSelect(int[] a, int lo, int hi, int kIdx) {
        while (lo <= hi) {
            int pivotIndex = partition(a, lo, hi);
            if (pivotIndex == kIdx) return a[pivotIndex];
            if (pivotIndex < kIdx) lo = pivotIndex + 1;
            else hi = pivotIndex - 1;
        }
        return -1;
    }
    private int partition(int[] a, int lo, int hi) {
        int pivotPos = lo + RAND.nextInt(hi - lo + 1);
        int pivot = a[pivotPos];
        swap(a, pivotPos, hi);
        int store = lo;
        for (int i = lo; i < hi; ++i) {
            if (a[i] < pivot) {
                swap(a, store++, i);
            }
        }
        swap(a, store, hi);
        return store;
    }
    private void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.kthSmallest(new int[] {10,5,4,3,48,6,2,33,53,10}, 4));
        System.out.println(s.kthSmallest(new int[] {7,10,4,3,20,15}, 3));
    }
}