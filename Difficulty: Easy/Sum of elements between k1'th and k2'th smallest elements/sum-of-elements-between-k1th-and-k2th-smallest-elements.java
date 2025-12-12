
class Solution { 
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        PriorityQueue<Long>pq = new PriorityQueue<>();
        for(int i = 0;i<N;i++)
        pq.add(A[i]);
        
        long count = 0;
        long sum = 0;
        while(!pq.isEmpty())
        {
            long temp = pq.poll();
            count++;
            if(count>K1 &&count<K2)
            sum += temp;
        }
        return sum;
    }
    
}