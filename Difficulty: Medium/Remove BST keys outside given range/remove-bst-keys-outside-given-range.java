class Solution {
    Node removekeys(Node root, int l, int r) {
        if (root == null)
            return null;
        root.left = removekeys(root.left, l, r);
        root.right = removekeys(root.right, l, r);
        if (root.data < l)
            return root.right;
        if (root.data > r)
            return root.left;
        return root;
    }
}
class Main {
    static Node insert(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.data) root.left = insert(root.left, key);
        else root.right = insert(root.right, key);
        return root;
    }
    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int[] arr = {6, -13, 14, -8, 13, 15, 7};
        Node root = null;
        for (int x : arr) root = insert(root, x);
        int l = -10, r = 13;
        Solution g = new Solution();
        Node pruned = g.removekeys(root, l, r);
        inorder(pruned);
        System.out.println();
    }
}