class Solution {
    private ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    private ArrayList<Integer> path = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> Paths(Node root) {
        preOrder(root);
        return result;
    }
    private void preOrder(Node root) {
        if (root == null) return;
        path.add(root.data);
        if (root.left == null && root.right == null)
            result.add(new ArrayList<>(path)); 
        else {
            preOrder(root.left); 
            preOrder(root.right);
        }
        path.remove(path.size() - 1);
    }
}