class LRUCache {
    private static class Node {
        int key, val;
        Node prev, next;
        Node(int k, int v) { key = k; val = v; }
    }
    private final int capacity;
    private final Map<Integer, Node> map;
    private Node head, tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = null;
        this.tail = null;
    }
    public int get(int key) {
        Node node = map.get(key);
        if (node == null) return -1;
        moveToHead(node);
        return node.val;
    }
    public void put(int key, int value) {
        Node node = map.get(key);
        if (node != null) {
            node.val = value;
            moveToHead(node);
            return;
        }
        Node newNode = new Node(key, value);
        addToHead(newNode);
        map.put(key, newNode);
        if (map.size() > capacity) {
            removeTail();
        }
    }
    private void addToHead(Node node) {
        node.prev = null;
        node.next = head;
        if (head != null) head.prev = node;
        head = node;
        if (tail == null) tail = node;
    }
    private void removeNode(Node node) {
        if (node.prev != null) node.prev.next = node.next;
        else head = node.next;
        if (node.next != null) node.next.prev = node.prev;
        else tail = node.prev;
        node.prev = null;
        node.next = null;
    }
    private void moveToHead(Node node) {
        if (node == head) return;
        removeNode(node);
        addToHead(node);
    }
    private void removeTail() {
        if (tail == null) return;
        map.remove(tail.key);
        removeNode(tail);
    }
}
public class Solution {
    public static List<Integer> processQueries(int cap, List<String[]> queries) {
        LRUCache cache = new LRUCache(cap);
        List<Integer> outputs = new ArrayList<>();
        for (String[] q : queries) {
            if (q[0].equals("PUT")) {
                int key = Integer.parseInt(q[1]);
                int val = Integer.parseInt(q[2]);
                cache.put(key, val);
            } else if (q[0].equals("GET")) {
                int key = Integer.parseInt(q[1]);
                outputs.add(cache.get(key));
            }
        }
        return outputs;
    }
    public static void main(String[] args) {
        int cap1 = 2;
        List<String[]> queries1 = Arrays.asList(
            new String[]{"PUT","1","2"},
            new String[]{"GET","1"}
        );
        System.out.println(processQueries(cap1, queries1));
        int cap2 = 2;
        List<String[]> queries2 = Arrays.asList(
            new String[]{"PUT","1","2"},
            new String[]{"PUT","2","3"},
            new String[]{"PUT","1","5"},
            new String[]{"PUT","4","5"},
            new String[]{"PUT","6","7"},
            new String[]{"GET","4"},
            new String[]{"PUT","1","2"},
            new String[]{"GET","3"});
        System.out.println(processQueries(cap2, queries2));
    }
}