public class Solution {
    public boolean isPalindrome(int n) {
        if (n < 0) return false;            
        if (n >= 0 && n < 10) return true;      
        if (n % 10 == 0) return n == 0;
        int reversedHalf = 0;
        while (n > reversedHalf) {
            reversedHalf = reversedHalf * 10 + (n % 10);
            n /= 10;
        }
        return n == reversedHalf || n == reversedHalf / 10;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(555));   
        System.out.println(s.isPalindrome(123));  
        System.out.println(s.isPalindrome(1221));  
        System.out.println(s.isPalindrome(10));   
        System.out.println(s.isPalindrome(0));   
    }
}