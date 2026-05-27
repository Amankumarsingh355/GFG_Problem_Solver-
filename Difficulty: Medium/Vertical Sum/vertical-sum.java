class Solution {
    void sum (
        Map<Integer, Integer> map, 
        Node root, 
        int y
    ) {
        if (root.left != null) sum(map, root.left, y - 1);
        if (root.right != null) sum(map, root.right, y + 1);
        map.compute(y, (k, v) -> v == null ? root.data : root.data + v);
    }
    
    public ArrayList<Integer> verticalSum(Node root) {
        Map<Integer, Integer> sums = new TreeMap<Integer, Integer>();
        sum(sums, root, 0);
        return new ArrayList<Integer>(sums.values());
    }
}