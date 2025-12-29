class Solution {
    final int MOD = 100000;
    class Pair{
        int first, second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    int minimumMultiplications(int[] arr, int start, int end) {
        int n = arr.length;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(start, 0));
        Set<Integer> st = new HashSet<>();
        st.add(start);
        while(!q.isEmpty()){
            Pair p = q.poll();
            int s = p.first;
            int steps = p.second;
            if(s == end) return steps;
            for(int i=0; i<n; i++){
                int newStart = (s*arr[i]) %MOD;
                if(!st.contains(newStart)){
                    st.add(newStart);
                   q.offer(new Pair(newStart, steps+1)); 
                }
            }
        }
        return -1;
    }
}