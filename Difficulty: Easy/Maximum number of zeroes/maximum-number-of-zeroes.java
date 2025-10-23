public class Solution {
    public String maxZero(ArrayList<String> arr) {
        int bestZeroCount = 0;
        String bestOriginal = null;
        for (String s : arr) {
            if (s == null) continue;
            String original = s.trim();
            if (original.length() == 0) continue;
            String core = original;
            if (core.charAt(0) == '+' || core.charAt(0) == '-') core = core.substring(1);
            if (core.length() == 0) continue;
            int zeros = 0;
            for (int i = 0; i < core.length(); ++i) {
                if (core.charAt(i) == '0') zeros++;
            }
            if (zeros == 0) continue;
            if (bestOriginal == null || zeros > bestZeroCount) {
                bestZeroCount = zeros;
                bestOriginal = original;
            } else if (zeros == bestZeroCount) {
                if (compareOriginalStrings(original, bestOriginal) > 0) {
                    bestOriginal = original;
                }
            }
        }
        return (bestOriginal == null) ? "-1" : bestOriginal;
    }
    private static int compareOriginalStrings(String a, String b) {
        boolean negA = a.startsWith("-");
        boolean negB = b.startsWith("-");
        if (negA && !negB) return -1;
        if (!negA && negB) return 1;
        String aa = negA ? a.substring(1) : a;
        String bb = negB ? b.substring(1) : b;
        if (aa.length() != bb.length()) return (aa.length() > bb.length()) ? 1 : -1;
        int cmp = aa.compareTo(bb);
        if (cmp == 0) return 0;
        return (cmp > 0) ? 1 : -1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("129","0092","23413","33843","9275","1189","3"));
        System.out.println(solution.maxZero(arr));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("10","20","3000","9999","200"));
        System.out.println(solution.maxZero(arr2));
        ArrayList<String> arr3 = new ArrayList<>(Arrays.asList("1","2","3","4"));
        System.out.println(solution.maxZero(arr3));
        ArrayList<String> arr4 = new ArrayList<>(Arrays.asList(
            "8876382","875874225","423609","674956779","41593","698949187","59557622","86352515",
            "19575692","14737455","989405","438753242","03873","63066","80037","196763","5054803",
            "45498","990132","8204505","234544193","635571","032598","4591866","64919964"
        ));
        System.out.println(solution.maxZero(arr4));
    }
}