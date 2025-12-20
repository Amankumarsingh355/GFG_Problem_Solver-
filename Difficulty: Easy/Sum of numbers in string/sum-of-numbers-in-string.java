class Solution {
    public static int findSum(String s) {
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                temp = temp * 10 + digit;
            } else {
                sum += temp;
                temp = 0;
            }
        }
        sum += temp;
        return sum;
    }
}