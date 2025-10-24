public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) return res;
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left = j + 1, right = n - 1;
                long need = (long)target - nums[i] - nums[j];
                while (left < right) {
                    long sum2 = (long)nums[left] + nums[right];
                    if (sum2 == need) {
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        res.add(quad);
                        left++; right--;
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (sum2 < need) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution sln = new Solution();
        int[] a = {0, 0, 2, 1, 1};
        System.out.println(sln.fourSum(a, 3));
        int[] b = {10, 2, 3, 4, 5, 7, 8};
        System.out.println(sln.fourSum(b, 23));
        int[] c = {0, 0, 2, 1, 1};
        System.out.println(sln.fourSum(c, 2));
    }
}