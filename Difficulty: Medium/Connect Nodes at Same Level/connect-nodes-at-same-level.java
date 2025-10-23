public class Solution {
    public void connect(Node root) {
        if (root == null) return;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            int sz = q.size();
            Node prev = null;
            for (int i = 0; i < sz; ++i) {
                Node cur = q.poll();
                if (prev != null) prev.nextRight = cur;
                prev = cur;
                if (cur.left != null) q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
            }
            if (prev != null) prev.nextRight = null;
        }
    }
    public List<Integer> levelOrder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node n = q.poll();
            res.add(n.data);
            if (n.left != null) q.add(n.left);
            if (n.right != null) q.add(n.right);
        }
        return res;
    }
    public List<Integer> inorder(Node root) {
        List<Integer> res = new ArrayList<>();
        inorderRec(root, res);
        return res;
    }
    private void inorderRec(Node node, List<Integer> res) {
        if (node == null) return;
        inorderRec(node.left, res);
        res.add(node.data);
        inorderRec(node.right, res);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Node root1 = new Node(3);
        root1.left = new Node(1);
        root1.right = new Node(2);
        sol.connect(root1);
        System.out.println(sol.levelOrder(root1));
        System.out.println(sol.inorder(root1));
        Node root2 = new Node(10);
        root2.left = new Node(20);
        root2.right = new Node(30);
        root2.left.left = new Node(40);
        root2.left.right = new Node(60);
        sol.connect(root2);
        System.out.println(sol.levelOrder(root2));
        System.out.println(sol.inorder(root2));
    }
}