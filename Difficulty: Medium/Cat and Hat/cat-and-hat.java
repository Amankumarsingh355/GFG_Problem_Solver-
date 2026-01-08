class Solution {
    public static boolean cat_hat(String str) {
        int n = str.length();
        int cats = 0, hats = 0;
        for (int i = 0; i <= n - 3; i++) {
            String curr = str.substring(i, i + 3);  
            if (curr.equals("cat")) cats++;
            if (curr.equals("hat")) hats++;
        }
        return cats == hats;
    }
}    