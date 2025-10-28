class Solution {
    public void recursion(int n, List<String> ans, String pair, int open, int close){
        if(pair.length()==n){
            ans.add(pair);
            return;
        }
        if(open<n/2){
            recursion(n, ans, pair+'(', open+1, close);
        }
        if(close<open){
            recursion(n, ans, pair+')', open, close+1);
        }
    }
    public ArrayList<String> generateParentheses(int n) {
        ArrayList<String> ans = new ArrayList<>();
        recursion(n, ans, "", 0, 0);
        return ans;
    }
}