class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        for (int i = A; i <= B; i++) {
            if (!set.contains(i)) {
                return false;
            }
        }
        return true;
    }
}