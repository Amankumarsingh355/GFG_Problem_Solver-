class Solution {
    public static String rearrangeString(String str) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] freq = new int[26];
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                pq.offer(new Pair(freq[i], (char)(i + 'a')));
            }
        }
        StringBuilder result = new StringBuilder();
        Pair prev = new Pair(-100, '#');
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            pq.offer(prev);
            if(curr.c > 0) {
                result.append(curr.ch);
                if(result.length() == str.length()){
                    break;
                }
            }
            curr.c = curr.c - 1;
            prev = curr;
        }
        return result.toString();
    }
    static class Pair implements Comparable<Pair> {
        int c;
        char ch;
        Pair(int c, char ch) {
            this.c = c;
            this.ch = ch;
        }
        public int compareTo(Pair o) {
            return o.c - this.c;
        }
    }
}