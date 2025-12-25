class Solution {
    String reverseWithSpacesIntact(String S) {
        int j = S.length() - 1, i = 0;
        StringBuilder res = new StringBuilder();
        while (i < S.length()) {
            if (S.charAt(i) != ' ') {
                while (j >= 0 && S.charAt(j) == ' ') {
                    j--;
                }
                res.append(S.charAt(j));
                j--;
            } else {
                res.append(' ');
            }
            i++;
        }
        return res.toString();
    }
}

