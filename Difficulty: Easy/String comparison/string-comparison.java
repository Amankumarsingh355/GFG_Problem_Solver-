class Solution {
    public static int stringComparison(String s1, String s2) {
        Map<String, Integer> order = new HashMap<>();
        String[] letters = {
            "a","b","c","d","e","f","g","h","i","j","k","l","m",
            "n","ng","o","p","q","r","s","t","u","v","w","x","y","z"
        };
        for (int i = 0; i < letters.length; i++) {
            order.put(letters[i], i);
        }
        List<String> t1 = parseString(s1);
        List<String> t2 = parseString(s2);
        int n = Math.min(t1.size(), t2.size());
        for (int i = 0; i < n; i++) {
            int rank1 = order.get(t1.get(i));
            int rank2 = order.get(t2.get(i));
            if (rank1 < rank2) return -1;
            if (rank1 > rank2) return 1;
        }
        if (t1.size() == t2.size()) return 0;
        return (t1.size() < t2.size()) ? -1 : 1;
    }
    private static List<String> parseString(String s) {
        List<String> tokens = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            if (i < s.length() - 1 && s.charAt(i) == 'n' && s.charAt(i + 1) == 'g') {
                tokens.add("ng");
                i += 2;
            } else {
                tokens.add(String.valueOf(s.charAt(i)));
                i++;
            }
        }
        return tokens;
    }
}