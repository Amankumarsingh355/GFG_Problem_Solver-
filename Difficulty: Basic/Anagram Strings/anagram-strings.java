class Solution {
    static int areAnagram(String S1, String S2) {
        if(S1.length()!=S2.length()) return 0;
        char[]a=S1.toCharArray();
        char[]b=S2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) return 0;
        }
        return 1;
    }
}