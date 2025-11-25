class Solution {
    public ArrayList<Integer> getDigitDiff1AndLessK(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num < k && num >= 10 && hasDigitDiffOf1(num)) {
                result.add(num);
            }
        }
        return result;
    }
    private boolean hasDigitDiffOf1(int num) {
        int prevDigit = num % 10;
        num /= 10;
        while (num > 0) {
            int currDigit = num % 10;
            if (Math.abs(currDigit - prevDigit) != 1) {
                return false;
            }
            prevDigit = currDigit;
            num /= 10;
        }
        return true;
    }
}