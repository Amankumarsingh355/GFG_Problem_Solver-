class myQueue {
    private final int[] arr;
    private final int capacity;
    private int front;
    private int rear;
    private int size;
    public myQueue(int n) {
        this.capacity = n;
        this.arr = new int[n];
        this.front = 0;
        this.rear = n - 1;
        this.size = 0;
    }
    public boolean enqueue(int x) {
        if (isFull()) return false;
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
        return true;    }
    public boolean dequeue() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }
    public int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }
    public int getRear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
}