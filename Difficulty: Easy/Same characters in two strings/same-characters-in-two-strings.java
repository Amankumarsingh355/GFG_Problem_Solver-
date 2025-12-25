class Solution {
    int sameChar(String A, String B) {
        int count=0;
        int n=A.length();
        for(int i=0;i<n;i++)
        {
            char ch1 = Character.toLowerCase(A.charAt(i));
            char ch2 = Character.toLowerCase(B.charAt(i));
            if(ch1==ch2)
            {
                count++;
            }
        }
        return count;
    }
}
