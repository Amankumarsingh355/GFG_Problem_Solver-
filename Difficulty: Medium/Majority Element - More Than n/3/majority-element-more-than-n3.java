public class Solution {
    public List<Integer> findMajority(int[] nums) {
        return majorityElement(nums);
    }
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        int cand1 = 0, cand2 = 0, cnt1 = 0, cnt2 = 0;
        for (int x : nums) {
            if (cnt1 > 0 && x == cand1) {
                cnt1++;
            } else if (cnt2 > 0 && x == cand2) {
                cnt2++;
            } else if (cnt1 == 0) {
                cand1 = x; cnt1 = 1;
            } else if (cnt2 == 0) {
                cand2 = x; cnt2 = 1;
            } else {
                cnt1--; cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0;
        for (int x : nums) {
            if (x == cand1) cnt1++;
            else if (x == cand2) cnt2++;
        }
        int n = nums.length;
        if (cnt1 > n / 3) res.add(cand1);
        if (cnt2 > n / 3) res.add(cand2);
        Collections.sort(res);
        return res;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findMajority(new int[]{2,2,3,1,3,2,1,1}));
        System.out.println(s.findMajority(new int[]{-5,3,-5}));
        System.out.println(s.findMajority(new int[]{3,2,2,4,1,4}));
    }
}