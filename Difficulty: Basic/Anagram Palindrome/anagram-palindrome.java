class Sol {
    int isPossible(String s) {
        int[] chars = new int[26];
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            chars[c - 'a']++;
        }
        int countOdd = 0;
        for (int i=0; i<chars.length; i++) {
            if (chars[i]%2 != 0) {
                if (countOdd == 0) {
                    countOdd++;
                } else {
                    return 0;
                }
            }
        }
        return 1;
    }
}