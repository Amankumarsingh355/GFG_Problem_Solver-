class Solution {
    public boolean isPossible(int N, int P, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<N;i++){
            graph.add(new ArrayList<>());
        }
            int[] indegree=new int[N];
            for(int[]pre:prerequisites){
                int a=pre[0],b=pre[1];
                graph.get(b).add(a);
                indegree[a]++;
            }
            Queue<Integer>q=new LinkedList<>();
            for(int i=0;i<N;i++){
                if(indegree[i]==0)q.add(i);
            }
            int count=0;
            while(!q.isEmpty()){
                int curr=q.poll();
                count++;
                for(int neigh:graph.get(curr)){
                    indegree[neigh]--;
                    if(indegree[neigh]==0)q.add(neigh);
                }
            }
            
        return count==N;
    }
}