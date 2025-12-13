class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length - 1, j = 0, max = arr[n];
        res.add(-1);
        for(int i = n; i > 0; i--) 
            res.add(Math.max(arr[i], res.get(j++)));
        Collections.reverse(res);
        return res;
    }
}