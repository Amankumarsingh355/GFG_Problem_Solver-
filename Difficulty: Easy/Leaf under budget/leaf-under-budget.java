public class Solution {
    public int getCount(Node root, int budget) {
        if (root == null) return 0;
        List<Integer> leafLevels = new ArrayList<>();
        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(root, 1));
        while (!q.isEmpty()) {
            Pair p = q.poll();
            Node node = p.node;
            int lvl = p.level;
            if (node.left == null && node.right == null) {
                leafLevels.add(lvl);
            }
            if (node.left != null) q.offer(new Pair(node.left, lvl + 1));
            if (node.right != null) q.offer(new Pair(node.right, lvl + 1));
        }
        Collections.sort(leafLevels);
        int count = 0;
        for (int cost : leafLevels) {
            if (budget >= cost) {
                budget -= cost;
                count++;
            } else break;
        }
        return count;
    }
    private static class Pair {
        Node node;
        int level;
        Pair(Node n, int l) { node = n; level = l; }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        Node root = new Node(10);
        root.left = new Node(8);
        root.left.left = new Node(3);
        root.right = new Node(2);
        root.right.left = new Node(3);
        root.right.left.right = new Node(4);
        root.right.right = new Node(6);
        System.out.println(s.getCount(root, 8));
        Node r2 = new Node(1);
        r2.left = new Node(2); r2.right = new Node(3);
        r2.left.left = new Node(4); r2.left.right = new Node(5);
        r2.right.left = new Node(6); r2.right.right = new Node(7);
        System.out.println(s.getCount(r2, 5));
    }
}