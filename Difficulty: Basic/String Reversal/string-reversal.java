class Solution {
    public String reverseString(String s) {
        boolean[] visited = new boolean[256];
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = n - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == ' ') continue;
            if(!visited[ch]){
                sb.append(ch);
                visited[ch] = true;
            }
        }
        return sb.toString();
    }
}