public class Solution {
    public void connect(Node root) {
        if (root == null) return;
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            Node prev = null;
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                if (prev != null) prev.nextRight = cur;
                prev = cur;
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
            if (prev != null) prev.nextRight = null;
        }
    }
    public List<String> printConnected(Node root) {
        List<String> out = new ArrayList<>();
        if (root == null) return out;
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node n = q.poll();
                out.add(String.valueOf(n.data));
                if (n.left != null) q.offer(n.left);
                if (n.right != null) q.offer(n.right);
            }
            out.add("#");
        }
        return out;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        Solution sol = new Solution();
        sol.connect(root);
        List<String> result = sol.printConnected(root);
        System.out.println(result);
        System.out.println(root.left.nextRight == root.right); 
        System.out.println(root.left.left.nextRight == root.left.right);
    }
}