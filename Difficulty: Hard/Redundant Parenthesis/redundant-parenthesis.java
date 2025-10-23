public class Solution {
    private static class Item {
        String expr;
        int prec;
        Item(String e, int p) { expr = e; prec = p; }
    }
    public String removeBrackets(String exp) {
        if (exp == null || exp.length() == 0) return exp;
        List<String> postfix = toPostfix(exp);
        Deque<Item> st = new ArrayDeque<>();
        for (String tok : postfix) {
            if (tok.length() == 1 && isOperator(tok.charAt(0))) {
                char op = tok.charAt(0);
                Item right = st.pop();
                Item left = st.pop();
                int prec = precedence(op);
                String L = left.expr;
                if (left.prec < prec) {
                    L = "(" + L + ")";
                }
                String R = right.expr;
                if (right.prec < prec || (right.prec == prec && (op == '-' || op == '/'))) {
                    R = "(" + R + ")";
                }
                String combined = L + op + R;
                st.push(new Item(combined, prec));
            } else {
                st.push(new Item(tok, 3));
            }
        }
        return st.isEmpty() ? "" : st.peek().expr;
    }
    private List<String> toPostfix(String s) {
        List<String> out = new ArrayList<>();
        Deque<Character> ops = new ArrayDeque<>();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == ' ') continue;
            if (Character.isLetter(c)) {
                out.add(String.valueOf(c));
            } else if (isOperator(c)) {
                while (!ops.isEmpty() && isOperator(ops.peek()) &&
                       (precedence(ops.peek()) > precedence(c) ||
                        (precedence(ops.peek()) == precedence(c) && isLeftAssociative(c)))) {
                    out.add(String.valueOf(ops.pop()));
                }
                ops.push(c);
            } else if (c == '(') {
                ops.push(c);
            } else if (c == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    out.add(String.valueOf(ops.pop()));
                }
                if (!ops.isEmpty() && ops.peek() == '(') ops.pop();
            }
        }
        while (!ops.isEmpty()) out.add(String.valueOf(ops.pop()));
        return out;
    }
    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    private int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }
    private boolean isLeftAssociative(char op) {
        return true;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.removeBrackets("(A*(B+C))")); 
        System.out.println(sol.removeBrackets("A+(B+(C))"));
        System.out.println(sol.removeBrackets("((A))"));   
        System.out.println(sol.removeBrackets("(A+B)*(C)"));
    }
}