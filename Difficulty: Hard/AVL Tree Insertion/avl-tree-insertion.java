public class Solution {
    private int height(Node node) {
        return node == null ? 0 : node.height;
    }
    private int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }
    public Node insertToAVL(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.data) {
            root.left = insertToAVL(root.left, key);
        } else if (key > root.data) {
            root.right = insertToAVL(root.right, key);
        } else {
            return root;
        }
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        int balance = getBalance(root);
        if (balance > 1 && key < root.left.data) {
            return rightRotate(root);
        }
        if (balance < -1 && key > root.right.data) {
            return leftRotate(root);
        }
        if (balance > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if (balance < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
}