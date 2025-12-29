class Solution {
    public int minSwaps(int arr[]) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i], i);
        }
        Arrays.sort(arr);
        int swaps = 0;
        int i = 0;
        while(i<n){
            if(i != map.get(arr[i])){
                swaps++;
                swap(arr, i, map.get(arr[i]));
            }else
                i++;
        }
        return swaps;
    }
    public void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}