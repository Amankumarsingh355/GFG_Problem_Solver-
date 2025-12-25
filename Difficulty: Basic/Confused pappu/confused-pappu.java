class Solution {
    long findDiff(long amount) {
        StringBuilder sb = new StringBuilder(String.valueOf(amount));
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '6') {  
                sb.setCharAt(i, '9');   
            }
        }
        long maxAmount = Long.parseLong(sb.toString());
        return maxAmount - amount;
    }
}