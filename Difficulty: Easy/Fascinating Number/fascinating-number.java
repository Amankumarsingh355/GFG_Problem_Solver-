class Solution {
    boolean fascinating(long n) {
        String a= Long.toString(n*2) ;
        String b= Long.toString(n*3) ;
        String o= Long.toString(n) ;
        String str= o+a+b ;
        if(str.length()!=9){
            return false ;
        }
        char [] chararray= str.toCharArray() ;
        Arrays.sort(chararray) ;
        return new String(chararray).equals("123456789");
    }
}