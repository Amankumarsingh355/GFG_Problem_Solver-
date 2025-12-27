class Solution {
    int search(String X, String Y) {
        int a=X.lastIndexOf(Y);
        if(a>-1)
            return a+1;
        else
            return -1;
    }
}