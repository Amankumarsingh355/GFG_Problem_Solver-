class Sol {
    int divisibleBy4(String N) {
        int len = N.length();
        int num = Integer.parseInt(N.substring(Math.max(0, len - 2)));
        if(num % 4 == 0){
            return 1;
        }else{
           return 0;
        }
    }
}