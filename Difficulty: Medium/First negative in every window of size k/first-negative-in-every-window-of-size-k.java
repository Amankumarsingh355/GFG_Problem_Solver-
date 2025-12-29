class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> li = new ArrayList<>();
        Queue<Integer> qu = new ArrayDeque<>();
        int i = 0; 
        int j = 0;
        while(j<arr.length){
            if(arr[j] < 0) qu.add(arr[j]);
            if(j-i+1 == k){
                if(qu.isEmpty()){
                    li.add(0);
                }else{
                    li.add(qu.peek());
                    if(arr[i]<0) qu.poll();
                }
                i++;
            }
            j++;
        }
        return li;
    }
}