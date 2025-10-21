public class Solution {
    public Node mergeKLists(Node[] arr) {
        if (arr == null || arr.length == 0) return null;
        PriorityQueue<Node> pq = new PriorityQueue<>(arr.length, (a, b) -> a.data - b.data);
        for (Node head : arr) if (head != null) pq.offer(head);
        Node dummy = new Node(0);
        Node tail = dummy;
        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            tail.next = cur;
            tail = tail.next;
            if (cur.next != null) pq.offer(cur.next);
        }
        return dummy.next;
    }
    public static void printList(Node head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.data);
            if (head.next != null) sb.append(" -> ");
            head = head.next;
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Node[] lists = new Node[3];
        lists[0] = new Node(1);
        lists[0].next = new Node(3);
        lists[0].next.next = new Node(7);
        lists[1] = new Node(2);
        lists[1].next = new Node(4);
        lists[1].next.next = new Node(8);
        lists[2] = new Node(9);
        Node head = sol.mergeKLists(lists);
        printList(head);
    }
}