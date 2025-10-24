public class Solution {
    public ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        if (arr == null || arr.length == 0) return res;
        int n = arr.length;
        int write = 1;
        for (int read = 1; read < n; read++) {
            if (arr[read] != arr[read - 1]) {
                arr[write++] = arr[read];
            }
        }
        for (int i = 0; i < write; i++) res.add(arr[i]);
        return res;
    }

    public static void main(String[] args) {
        Solution ob = new Solution();
        System.out.println(ob.removeDuplicates(new int[]{2,2,2,2,2}));
        System.out.println(ob.removeDuplicates(new int[]{1,2,4}));
        System.out.println(ob.removeDuplicates(new int[]{1}));
        System.out.println(ob.removeDuplicates(new int[]{}));
    }
}