public class Solution {
    public int maxConsecBits(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int maxRun = 1;
        int curRun = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                curRun++;
            } else {
                if (curRun > maxRun) maxRun = curRun;
                curRun = 1;
            }
        }
        if (curRun > maxRun) maxRun = curRun;
        return maxRun;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxConsecBits(new int[] {0,1,0,1,1,1,1}));
        System.out.println(s.maxConsecBits(new int[] {0,0,1,0,1,0}));  
        System.out.println(s.maxConsecBits(new int[] {0,0,0,0}));   
        System.out.println(s.maxConsecBits(new int[] {1}));
    }
}