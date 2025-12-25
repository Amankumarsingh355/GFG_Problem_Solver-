class Solution {
    static int findLastOccurence(String A, String B) {
        int idx=A.indexOf(B);
        int lastidx=-1;
        while(idx>=0)
        {
            lastidx=idx+1;
            idx=A.indexOf(B,idx+1);
        }
        return lastidx;
        
    }
}