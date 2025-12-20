class Solution {
    public boolean isPalinSent(String s) {
        int n = s.length();
        int si = 0, ei = n-1;
        while(si < ei){
            while(si < n && !Character.isLetter(s.charAt(si)) && !Character.isDigit(s.charAt(si))) si++;
            while(ei >= 0 && !Character.isLetter(s.charAt(ei)) && !Character.isDigit(s.charAt(ei))) ei--;
            if(si >= ei) break;
            char ch = Character.isDigit(s.charAt(si)) ? s.charAt(si) : Character.toLowerCase(s.charAt(si));
            char ch2 = Character.isDigit(s.charAt(ei)) ? s.charAt(ei) : Character.toLowerCase(s.charAt(ei));
            if(ch != ch2) return false;
            si++; ei--;
        }
        return true;
    }
}