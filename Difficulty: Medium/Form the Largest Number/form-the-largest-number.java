class Solution {
    class Node implements Comparable<Node> {
        int val; int idx;
        Node(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(Node n2){
            ArrayList<Integer> list = SOD(this.val);
            ArrayList<Integer> list2 = SOD(n2.val);
            int n = list.size();
            int m = list2.size();
            int a = 0, i = 0, j = 0;
            int lar = Math.max(n,m);
            while(a < (2*lar)){
                if(list2.get(j) != list.get(i))
                   return list2.get(j) - list.get(i);
                a++;
                i = (i+1) % n;
                j = (j+1) % m;
            }
            return 0;
        }
    }
    public String findLargest(int[] arr) {
         int n = arr.length;
         Node[] arr2 = new Node[n];
         for(int i = 0; i < n; i++){
            arr2[i] = new Node(arr[i],i);
         }
         Arrays.sort(arr2);
         if(arr[arr2[0].idx] == 0) return "0";
         StringBuilder sb = new StringBuilder();
         for(int i = 0; i < n; i++){
            sb.append(arr[arr2[i].idx]);
         }
         return sb.toString();
    }
    private ArrayList<Integer> SOD(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(n == 0) list.add(0);
        int n2 = n;
        
        while(n2 != 0){
            list.add(0,(n2%10));
            n2 /= 10;
        }
        return list;
    }
}