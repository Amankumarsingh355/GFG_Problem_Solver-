class Solution {
    int ans = -1;
    public int solve(Node root, int k, int node){
        if(root==null){
            return -1;
        }
        if(root.data==node){
            return 0;
        }
        int leftDist = solve(root.left, k, node);
        int rightDist = solve(root.right, k, node);
        
        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        int validDist = (leftDist == -1) ? rightDist : leftDist;
        
        if(validDist+1==k && ans == -1){
            ans = root.data;
        }
        return validDist+1;
    }
    public int kthAncestor(Node root, int k, int node) {
        ans = -1;
        solve(root, k, node);
        return ans;
    }
}