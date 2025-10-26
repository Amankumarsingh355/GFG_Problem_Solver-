public class Solution {
    public int maxLength(String s) {
        if (s == null || s.length() < 2) return 0;
        int maxLen = 0;
        Deque<Integer> st = new ArrayDeque<>();
        st.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') st.push(i);
            else {
                st.pop();
                if (st.isEmpty()) st.push(i);
                else maxLen = Math.max(maxLen, i - st.peek());
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String S = ")()())";
        Solution ob = new Solution();
        System.out.println(ob.maxLength(S));
    }
}