class Solution {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        leftViewDFS(root, 0, ans);
        return ans;
    }
    private void leftViewDFS(Node node, int level, ArrayList<Integer> ans) {
        if (node == null) return;
        if (level == ans.size()) {
            ans.add(node.data);
        }
        leftViewDFS(node.left, level + 1, ans);
        leftViewDFS(node.right, level + 1, ans);
    }
}