class Solution {
    public void sumArray(List<Integer> arr) {
       int sum = arr.stream().mapToInt(Integer::intValue).sum();
        for (int i = 0; i <arr.size() ; i++) {
            arr.set(i,sum-arr.get(i));
        }
    }
}