class Solution {
    void swapDigits(Str n1, Str n2){
        String f1=Character.toString(n1.val.charAt(0));
        String f2=Character.toString(n2.val.charAt(0));
        String e1=Character.toString(n1.val.charAt(n1.val.length()-1));
        String e2=Character.toString(n2.val.charAt(n2.val.length()-1));
        n1.val=e2+n1.val.substring(1,n1.val.length()-1)+f2;
        n2.val=e1+n2.val.substring(1,n2.val.length()-1)+f1;
    }
}