
class Solution {
    public ArrayList<Integer> getKClosest(Node root, int target, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return b[0] - a[0]; 
            return b[1] - a[1];
        });
        inorder(root, target, k, pq);

        ArrayList<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(pq.poll()[1]);
        }
        return ans; 
    }
    private void inorder(Node root, int target, int k, PriorityQueue<int[]> pq) {
        if (root == null) return;
        inorder(root.left, target, k, pq);
        int diff = Math.abs(root.data - target);
        pq.offer(new int[]{diff, root.data});
        if (pq.size() > k) pq.poll();
        inorder(root.right, target, k, pq);
    }
}
