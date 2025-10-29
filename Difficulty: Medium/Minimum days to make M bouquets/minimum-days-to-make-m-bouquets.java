class Solution {
    class Node implements Comparable<Node>{
        int si;
        int ei;
        int max;
        Node(int si, int ei, int max){
            this.si = si;
            this.ei = ei;
            this.max = max;
        }
        @Override
        public int compareTo(Node n2){
            if(this.max == n2.max) return this.si-n2.si;
            else return this.max-n2.max;
        }
    }
    class Node2 implements Comparable<Node2>{
        int si;
        int max;
        Node2(int si, int max){
            this.si = si;
            this.max = max;
        }
        @Override
        public int compareTo(Node2 n2){
            if(this.max == n2.max) return this.si-n2.si;
            else return n2.max-this.max;
        }
    }
    public int minDaysBloom(int[] arr, int k, int m) {
        int n = arr.length;
        int rem = n - (m*k);
        if(rem < 0) return -1;
        PriorityQueue<Node2> pq = new PriorityQueue<>();
        PriorityQueue<Node> pq2 = new PriorityQueue<>();
        boolean[] vis = new boolean[n];
        for(int i = 0; i < k; i++){
            pq.add(new Node2(i,arr[i]));
        }
        int si = 0;
        int ei = k-1;
        Node2 node = pq.peek();
        pq2.add(new Node(si,ei,node.max));
        ei++;
        for(int i = 1; i < n && ei < n; i++,ei++){
            while(!pq.isEmpty() && pq.peek().si < i){
                pq.remove();
            }
            pq.add(new Node2(ei,arr[ei]));
            pq2.add(new Node(i,ei,pq.peek().max));
        }
        int j = 0;
        while(!pq2.isEmpty() && j < m){
            Node no = pq2.remove();
            if(check(no.si,no.ei,vis)){
                j++;
                Arrays.fill(vis,no.si,no.ei+1,true);
            }
            if(j == m) return no.max;
        }
        return -1;
    }
    private boolean check(int si, int ei, boolean[] vis){
        for(int i = si; i <= ei; i++){
            if(vis[i]) return false;
        }
        return true;
    }
}