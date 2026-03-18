class Solution{
    static class NodeVal{
        int max,min,size;
        public NodeVal(int min,int max,int size){
            this.min=min;
            this.max=max;
            this.size=size;
        }
    }
    private static NodeVal helper(Node root){
        if(root==null) return new NodeVal(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        NodeVal left=helper(root.left);
        NodeVal right=helper(root.right);
        if(left.max<root.data && right.min>root.data){
            return new NodeVal(Math.min(root.data,left.min),Math.max(root.data,right.max),left.size+right.size+1);
        }
        return new NodeVal(Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(left.size,right.size));
    }
    static int largestBst(Node root)
    {
        return helper(root).size;
    }
}