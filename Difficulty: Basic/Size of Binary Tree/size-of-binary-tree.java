/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public int getSize(Node root) {
        // code here
        if(root == null){
            return 0;
        }
        int leftSubTreeHeight = getSize(root.left);
        int rightSubTreeHeight = getSize(root.right);
        return 1 + leftSubTreeHeight + rightSubTreeHeight;
    }
}