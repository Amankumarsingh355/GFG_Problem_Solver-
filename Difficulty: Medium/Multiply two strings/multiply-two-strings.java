import java.util.*;

public class Solution {
    public String multiplyStrings(String s1, String s2) {
        if (s1 == null || s2 == null) return "0";
        int i1 = 0, i2 = 0;
        boolean neg1 = false, neg2 = false;
        if (s1.length() > 0 && (s1.charAt(0) == '+' || s1.charAt(0) == '-')) {
            neg1 = s1.charAt(0) == '-';
            i1 = 1;
        }
        if (s2.length() > 0 && (s2.charAt(0) == '+' || s2.charAt(0) == '-')) {
            neg2 = s2.charAt(0) == '-';
            i2 = 1;
        }
        while (i1 < s1.length() && s1.charAt(i1) == '0') i1++;
        while (i2 < s2.length() && s2.charAt(i2) == '0') i2++;
        if (i1 >= s1.length() || i2 >= s2.length()) return "0";
        boolean negative = neg1 ^ neg2;
        int n1 = s1.length() - i1;
        int n2 = s2.length() - i2;
        int[] res = new int[n1 + n2];
        for (int p1 = s1.length() - 1, i = 0; p1 >= i1; p1--, i++) {
            int a = s1.charAt(p1) - '0';
            for (int p2 = s2.length() - 1, j = 0; p2 >= i2; p2--, j++) {
                int b = s2.charAt(p2) - '0';
                res[i + j] += a * b;
            }
        }
        int carry = 0;
        for (int k = 0; k < res.length; k++) {
            int sum = res[k] + carry;
            res[k] = sum % 10;
            carry = sum / 10;
        }
        StringBuilder sb = new StringBuilder();
        int idx = res.length - 1;
        while (idx > 0 && res[idx] == 0) idx--;
        for (int k = idx; k >= 0; k--) sb.append((char)('0' + res[k]));
        if (negative) sb.insert(0, '-');
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution g = new Solution();
        String a = "0033", b = "2";
        System.out.println(g.multiplyStrings(a, b));
        System.out.println(g.multiplyStrings("11", "23"));
        System.out.println(g.multiplyStrings("123", "0"));
        System.out.println(g.multiplyStrings("-12", "10"));
        System.out.println(g.multiplyStrings("-12", "-10"));
        System.out.println(g.multiplyStrings("000", "0000"));
        System.out.println(g.multiplyStrings("+0012", "003"));
    }
}