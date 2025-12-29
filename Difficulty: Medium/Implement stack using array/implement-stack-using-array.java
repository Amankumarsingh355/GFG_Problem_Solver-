class myStack {
    private int[] arr;
    private int idx;
    public myStack(int n) {
        arr = new int[n];
        idx = -1;
    }
    public boolean isEmpty() {
        if(idx == -1) return true;
        else return false;
    }
    public boolean isFull() {
        if(idx == arr.length - 1) return true;
        else return false;
    }
    public void push(int x) {
        if(isFull()) return;
        idx++;
        arr[idx] = x;
    }
    public void pop() {
        if(idx == -1) return;
        arr[idx] = 0;
        idx--;
    }
    public int peek() {
        if(idx == -1) return -1;
        return arr[idx];
    }
}