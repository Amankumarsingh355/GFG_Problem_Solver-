class Solution {
    boolean isBinary(String s) {
        int left=0,right=s.length()-1;
        while(left<=right){
            char left_char=s.charAt(left++);
            char right_char=s.charAt(right--);
            if(left_char!='1' && left_char!='0')
                return false;
             if(right_char!='1' && right_char!='0')
                return false;   
        }
        return true;
    }
}