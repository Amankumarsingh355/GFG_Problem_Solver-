class Solution {
    public List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        List<List<Integer>> l = new ArrayList<>();
        int i = lower, index = 0;
        while(i <= upper) {
            if(index == arr.length) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(upper);
                l.add(list);
                i = upper + 1;
            }
            else if(i == arr[index]) {
                index ++ ;
                i ++ ;
            }
            else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(arr[index] - 1);
                l.add(list);
                i = arr[index] + 1;
                index ++ ;
            }
        }
        return l;
    }
}