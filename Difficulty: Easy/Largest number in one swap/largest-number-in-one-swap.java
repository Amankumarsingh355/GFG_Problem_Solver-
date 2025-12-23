class Solution {
    public String largestSwap(String s) {
        int n = s.length();
        int[] count = new int[10];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            count[s.charAt(i)-'0']++;
            hm.put((s.charAt(i)-'0'),i);
        }
        int idx = -1;
        int idx2 = -1;
        for(int i = 0; i < n; i++){
            int val = s.charAt(i)-'0';
            count[val]--;
            for(int j = 9; j > val; j--){
                if(count[j] > 0){
                    idx = i;
                    idx2 = hm.get(j);
                    break;
                }
            }
            if(idx != -1) break;
        }
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < n; i++){
            if(i != idx && i != idx2) sb.append(s.charAt(i));
            else sb = i == idx ? sb.append(s.charAt(idx2)) : sb.append(s.charAt(idx));
        }
        return sb.toString();
    }
}