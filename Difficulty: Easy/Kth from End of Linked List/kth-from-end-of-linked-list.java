class Solution {
    int getKthFromLast(Node head, int k) {
        if(k == 1 && head.next == null) return head.data;
        Node slow = head, fast = head;
        while(k != 0 && fast != null){
            fast = fast.next;
            k--;
        }
        if(k != 0) return -1;
        if(fast == null) return head.data;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.next.data;
    }
}