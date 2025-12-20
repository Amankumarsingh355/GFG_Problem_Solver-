class Solution {
public static String printNumber(String s, int m) {
    if(m == 0) return "";
    int i = s.length() - m;
    String n = null;
    switch (s.charAt(i)) {
        case 'a': case 'b': case 'c': n = "2"; break;
        case 'd': case 'e': case 'f': n = "3"; break;
        case 'g': case 'h': case 'i': n = "4"; break;
        case 'j': case 'k': case 'l': n = "5"; break;
        case 'm': case 'n': case 'o': n = "6"; break;
        case 'p': case 'q': case 'r': case 's': n = "7"; break;
        case 't': case 'u': case 'v': n = "8"; break;
        default: n = "9"; break;
    }
    return n + printNumber(s, m - 1);
}
}