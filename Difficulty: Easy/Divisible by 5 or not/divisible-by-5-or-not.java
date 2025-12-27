class Solution {
    static String isDivisibleBy5(String bin) {
        int remainder = 0;
        for (int i = 0; i < bin.length(); i++) {
            int bit = bin.charAt(i) - '0';
            remainder = (remainder * 2 + bit) % 5;
        }
        return (remainder == 0) ? "Yes" : "No";
    }
}