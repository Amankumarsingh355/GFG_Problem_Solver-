class Solution {
    private int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    private int findMedian(Node root, int n) {
        int[] count = new int[1]; 
        int[] result = new int[1]; 
        inorder(root, n, count, result);
        return result[0];
    }
    private void inorder(Node root, int n, int[] count, int[] result) {
        if (root == null) return;
        inorder(root.left, n, count, result);
        count[0]++;
        if ((n % 2 == 0 && count[0] == n/2) || (n % 2 == 1 && count[0] == (n+1)/2)) {
            result[0] = root.data;
            return;
        }
        inorder(root.right, n, count, result);
    }
    public int findMedian(Node root) {
        int n = countNodes(root);
        return findMedian(root, n);
    }
}