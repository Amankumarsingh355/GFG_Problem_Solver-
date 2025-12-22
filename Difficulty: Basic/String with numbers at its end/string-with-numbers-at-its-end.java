class Solution {
    int isSame(String s) {
        int n = s.length();
        int i = n - 1;
        while (i >= 0 && Character.isDigit(s.charAt(i))) {
            i--;
        }
        if (i == n - 1) 
        return 0;
        String text = s.substring(0, i + 1);
        String numberStr = s.substring(i + 1);
        try{
            long number= Long.parseLong(numberStr);
        if(text.length()==number){
            return 1;
        }
        else{
            return 0;
        }
        }
        catch(NumberFormatException e){
            return 0;
        }
        }
}