public class Solution {
    public Node mirror(Node root) {
        if (root == null) return null;
        Node left = mirror(root.left);
        Node right = mirror(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.right.left = new Node(4);
        Node m1 = s.mirror(root1);
        printLevelOrder(m1);
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        Node m2 = s.mirror(root2);
        printLevelOrder(m2);
    }
    private static void printLevelOrder(Node root) {
        if (root == null) { System.out.println("[]"); return; }
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        List<String> out = new ArrayList<>();
        while (!q.isEmpty()) {
            Node n = q.poll();
            if (n == null) { out.add("N"); continue; }
            out.add(String.valueOf(n.data));
            if (n.left != null || n.right != null) {
                q.add(n.left);
                q.add(n.right);
            }
        }
        while (!out.isEmpty() && out.get(out.size()-1).equals("N")) out.remove(out.size()-1);
        System.out.println(out);
    }
}