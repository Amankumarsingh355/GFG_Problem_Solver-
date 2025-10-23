import java.util.ArrayDeque;
import java.util.Deque;
class StackQueue {
    private Deque<Integer> in;
    private Deque<Integer> out;
    public StackQueue() {
        in = new ArrayDeque<>();
        out = new ArrayDeque<>();
    }
    public void Push(int x) {
        in.push(x);
    }
    public int Pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) out.push(in.pop());
        }
        return out.isEmpty() ? -1 : out.pop();
    }
}