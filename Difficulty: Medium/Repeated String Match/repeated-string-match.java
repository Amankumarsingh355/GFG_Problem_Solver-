class Solution {
    static int repeatedStringMatch(String a, String b) {
        if(a.equals(b))return 1;
        int n = a.length(), m = b.length();
        if(n>m){
            for(int i=0; i<=(n-m); i++){
                if((a.substring(i, i+m)).equals(b))return 1;
            }
            return -1;
        }
        StringBuilder s = new StringBuilder();
        int c = 0;
        while(c<m){
            s.append(a);
            c++;
        }
        
        String t = s.toString();
        for(int i = 0; i<=(m*n - m); i++){
            if((t.substring(i, i+m)).equals(b))return 1 + (i+m)/n;
        }
        
        return -1;
    }
}
