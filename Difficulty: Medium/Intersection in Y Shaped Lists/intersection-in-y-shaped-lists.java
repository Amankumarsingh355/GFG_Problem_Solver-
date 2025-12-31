class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        if(head1==null || head2==null){return null;}
        Node t = head1;
        Node tt = head2;
        while(t!=tt){
            t=t==null?head2:t.next;
            tt=tt==null?head1:tt.next;
        }
        return t;
    }
}       