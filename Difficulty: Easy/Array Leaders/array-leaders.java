class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int max = -1;
        for(int i=arr.length-1; i >= 0; i--) {
            if(arr[i] >= max ) {
                max = arr[i];
                result.add(arr[i]);
                
            }
        }
        Collections.reverse(result);
        return result;
    }
}