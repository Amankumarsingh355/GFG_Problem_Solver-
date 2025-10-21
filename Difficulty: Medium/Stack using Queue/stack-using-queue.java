class myStack {
    private Queue<Integer> q;
    public myStack() {
        q = new LinkedList<>();
    }
    public void push(int x) {
        q.add(x);
        int sz = q.size();
        for (int i = 0; i < sz - 1; i++) {
            q.add(q.remove());
        }
    }
    public void pop() {
        if (!q.isEmpty()) q.remove();
    }
    public int top() {
        return q.isEmpty() ? -1 : q.peek();
    }
    public int size() {
        return q.size();
    }
}