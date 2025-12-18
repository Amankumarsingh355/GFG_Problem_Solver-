class Solution {
    public boolean findPairs(int arr[]) {
        ArrayList<Integer> sums = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            for(int j = i + 1; j<arr.length; j++){
                int sum = arr[i]+arr[j];
                if(sums.contains(sum)){
                    return true;
                }
                sums.add(sum);
            }
        }
        return false;
    }
}