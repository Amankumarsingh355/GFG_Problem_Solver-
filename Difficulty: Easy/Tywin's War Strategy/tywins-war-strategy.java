class Solution {
    public int minSoldiers(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int count = 0;
        int tar = n%2 == 0 ? n/2 : n/2 + 1;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(arr[i] % k != 0){
                int q = arr[i]/k;
                list.add((k*(q+1))-arr[i]);
            }else count++;
        }
        if(count >= tar) return sum;
        Collections.sort(list);
        int idx = 0;
        while(count < tar){
            sum += list.get(idx);
            idx++;
            count++;
        }
        return sum;
    }
}