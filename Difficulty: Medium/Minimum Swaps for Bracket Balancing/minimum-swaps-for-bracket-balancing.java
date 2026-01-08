class Solution {
    static int minimumNumberOfSwaps(String s) {
        int open =0;
        int close =0;
        int swaps =0;
        int unbalancedClose = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='['){
                open++;
                if(unbalancedClose>0){
                    swaps=swaps+unbalancedClose;
                    unbalancedClose--;
                }
            }
            else{
                close++;
                unbalancedClose = close-open;
            }
        }
        return swaps;
}
}