public class Solution {
    public int maxWater(int[] height) {
        if (height == null || height.length < 3) return 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int trapped = 0;
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) leftMax = height[left];
                else trapped += leftMax - height[left];
                left++;
            } else {
                if (height[right] >= rightMax) rightMax = height[right];
                else trapped += rightMax - height[right];
                right--;
            }
        }
        return trapped;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxWater(new int[]{3,0,1,0,4,0,2})); 
        System.out.println(s.maxWater(new int[]{3,0,2,0,4}));
        System.out.println(s.maxWater(new int[]{1,2,3,4})); 
        System.out.println(s.maxWater(new int[]{2,1,5,3,1,0,4}));
    }
}