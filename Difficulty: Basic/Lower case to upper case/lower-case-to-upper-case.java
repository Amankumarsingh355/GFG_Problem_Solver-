class Solution {
    String to_upper(String str) {
        if(str.charAt(0) >= 65 || str.charAt(0) <= 90)
        {
            return str.toUpperCase();
        }
         return str.toLowerCase();
    }
}