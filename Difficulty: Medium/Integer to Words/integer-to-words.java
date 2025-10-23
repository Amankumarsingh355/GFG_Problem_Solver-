public class Solution {
    private static final String[] BELOW_20 = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public String convertToWords(int num) {
        return numberToWords(num);
    }
    private String numberToWords(int num) {
        if (num == 0) return "Zero";
        StringBuilder sb = new StringBuilder();
        int billion = num / 1_000_000_000;
        int million = (num / 1_000_000) % 1000;
        int thousand = (num / 1000) % 1000;
        int rest = num % 1000;
        if (billion != 0) {
            appendThree(sb, billion);
            sb.append(" Billion");
        }
        if (million != 0) {
            if (sb.length() > 0) sb.append(" ");
            appendThree(sb, million);
            sb.append(" Million");
        }
        if (thousand != 0) {
            if (sb.length() > 0) sb.append(" ");
            appendThree(sb, thousand);
            sb.append(" Thousand");
        }
        if (rest != 0) {
            if (sb.length() > 0) sb.append(" ");
            appendThree(sb, rest);
        }
        return sb.toString();
    }
    private void appendThree(StringBuilder sb, int num) {
        if (num >= 100) {
            sb.append(BELOW_20[num / 100]).append(" Hundred");
            num %= 100;
            if (num != 0) sb.append(" ");
        }
        if (num >= 20) {
            sb.append(TENS[num / 10]);
            num %= 10;
            if (num != 0) sb.append(" ").append(BELOW_20[num]);
        } else if (num > 0) {
            sb.append(BELOW_20[num]);
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] tests = {0, 123, 10245, 2147483647};
        for (int t : tests) {
            System.out.println(t + " -> " + sol.convertToWords(t));
        }
    }
}