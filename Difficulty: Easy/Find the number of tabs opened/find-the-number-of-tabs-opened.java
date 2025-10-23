public class Solution {
    public int countTabs(List<String> arr) {
        if (arr == null || arr.isEmpty()) return 0;
        Set<String> open = new HashSet<>();
        for (String op : arr) {
            if ("END".equals(op)) {
                open.clear();
            } else {
                if (!open.add(op)) open.remove(op);
            }
        }
        return open.size();
    }
    public static void main(String[] args) {
        Solution ob = new Solution();
        System.out.println(ob.countTabs(Arrays.asList("1","2","1","END","2")));
        System.out.println(ob.countTabs(Arrays.asList("1","2","END")));
    }
}