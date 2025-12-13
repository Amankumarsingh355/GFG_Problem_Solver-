class Solution {
    int minOperations(int[] arr, int n, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i = 0;i<n;i++)
        pq.add(arr[i]);
        int op = 0;
        while(!pq.isEmpty())
        {
            if(pq.peek()>=k)
            break;
            if(pq.size()>=2){
                int n1 = pq.poll();
                int n2 = pq.poll();
                pq.add(n1+n2);
                op++;
            }
            else
            return -1;
        }
        return op;
    }
}