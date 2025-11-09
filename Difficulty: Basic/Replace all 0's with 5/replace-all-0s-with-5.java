class Solution {
    int convertfive(int num) {
        if(num == 0) return 5;
        int rev = 0;
        while(num > 0){
            int temp = num % 10;
            if(temp == 0) temp = 5;
            rev *= 10;
            rev += temp;
            num /= 10;
        }
        num = 0;
        while(rev > 0){
            int temp = rev % 10;
            if(temp == 0) temp = 5;
            num *= 10;
            num += temp;
            rev /= 10;
        }
        return num;
    }
}