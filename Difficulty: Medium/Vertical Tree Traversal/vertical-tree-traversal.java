class Solution {
    static class NodeInfo {
        Node node;
        int col;
        NodeInfo(Node n, int c) { node = n; col = c; }
    }

    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Map<Integer, ArrayList<Integer>> colMap = new HashMap<>();
        Queue<NodeInfo> q = new LinkedList<>();
        q.offer(new NodeInfo(root, 0));
        int minCol = 0, maxCol = 0;
        while (!q.isEmpty()) {
            NodeInfo cur = q.poll();
            Node node = cur.node;
            int col = cur.col;
            colMap.computeIfAbsent(col, k -> new ArrayList<>()).add(node.data);
            if (node.left != null) {
                q.offer(new NodeInfo(node.left, col-1));
                minCol = Math.min(minCol, col - 1);
            }
            if (node.right != null) {
                q.offer(new NodeInfo(node.right, col + 1));
                maxCol = Math.max(maxCol, col + 1);
            }
        }
        for (int c = minCol; c <= maxCol; c++) {
            res.add(colMap.getOrDefault(c, new ArrayList<>()));
        }
        return res;
    }
}