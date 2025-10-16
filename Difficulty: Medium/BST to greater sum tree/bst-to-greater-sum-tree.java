class Solution {
    int sum = 0;
    public Node transformTree(Node root) {
        transform(root);
        return root;
    }
    private void transform(Node root) {
        if (root == null) return;
        transform(root.right);
        int temp = root.data;
        root.data = sum;
        sum += temp;
        transform(root.left);
    }
}
