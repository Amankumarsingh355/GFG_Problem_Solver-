public class Solution {
    public Node lca(Node root, int n1, int n2) {
        if (root == null) return null;
        if (root.data == n1 || root.data == n2) return root;
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
    public int LCA(Node root, int n1, int n2) {
        Node node = lca(root, n1, n2);
        return node == null ? -1 : node.data;
    }
}