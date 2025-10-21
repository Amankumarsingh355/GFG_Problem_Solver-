public class Solution {
    public boolean hasPathSum(Node root, int target) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return target == root.data;
        int rem = target - root.data;
        return hasPathSum(root.left, rem) || hasPathSum(root.right, rem);
    }
}