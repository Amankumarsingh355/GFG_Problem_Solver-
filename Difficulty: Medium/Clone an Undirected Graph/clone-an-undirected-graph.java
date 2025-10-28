class Solution {
    Node cloneGraph(Node node) {
       HashMap<Node,Node> mp=new HashMap<>();
       Node newNode= new Node(node.val);
       mp.put(node,newNode);
       Queue<Node> q=new LinkedList<>();
       q.add(node);
       while(!q.isEmpty()){
           Node cur=q.poll();
           for(Node x:cur.neighbors){
               
               if(!mp.containsKey(x)){
                   mp.put(x,new Node(x.val));
                   q.add(x);
               }
               
               mp.get(cur).neighbors.add(mp.get(x));
           }
       }
       return newNode;
    }
}