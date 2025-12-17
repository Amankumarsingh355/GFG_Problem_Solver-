class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num : a) {
            set.add(num);
        }
        for(int num : b) {
            set.add(num);
        }
        ans.addAll(set);
        Collections.sort(ans);
        return ans;
    }
}