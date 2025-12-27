class Solution
{
    public String smallestNumber(String num)
    {
        int n = num.length();
        if (n == 1) return num; 
        char[] digits = num.toCharArray();
        int[] lastIndex = new int[10];
        for (int i = 0; i < n; i++) {
            lastIndex[digits[i] - '0'] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int d = 0; d < digits[i] - '0'; d++) {
                if (lastIndex[d] > i) {
                    if (i != 0 || d != 0) {
                        char temp = digits[i];
                        digits[i] = (char) (d + '0');
                        digits[lastIndex[d]] = temp;
                        return new String(digits);
                    }
                }
            }
        }
        return num;
    }
}