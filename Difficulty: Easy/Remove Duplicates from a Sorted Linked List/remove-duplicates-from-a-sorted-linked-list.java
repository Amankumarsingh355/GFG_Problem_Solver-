class Solution {
    Node removeDuplicates(Node head) {
        if (head == null) return null;
        HashSet<Integer> seen = new HashSet<>();
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            if (seen.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                seen.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}