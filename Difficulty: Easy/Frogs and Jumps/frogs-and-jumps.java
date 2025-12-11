class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        HashSet<Integer> hs = new HashSet<>();
        Arrays.sort(frogs);
        for(int i=1; i<=leaves; i++){
            hs.add(i);
        }
        HashSet<Integer> hs1 = new HashSet<>();
        for(int x : frogs){
            hs1.add(x);
        }
        for(int i=0; i<N; i++){
            int k = frogs[i];
            if(!hs1.contains(k)){
                continue;
            }
            for(int j=k; j<=leaves; j += k){
                if(hs.contains(j)){
                    hs.remove(j);
                }
                if(hs1.contains(j)){
                    hs1.remove(j);
                }
            }
            if(hs.size() == 0){
                return 0;
            }
            if(hs1.size() == 0){
                return hs.size();
            }
        }
        return hs.size();
    }
}