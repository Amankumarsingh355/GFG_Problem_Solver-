class Solution {
    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        if(n == 0){
            return true;
        }
        if(m < n){
            return false;
        }
        if(m == 1){
            if(seats[0] == 0){
                return true;
            }
            else{
                return false;
            }
        }
        if(seats[0] == 0 && seats[1] == 0){
            n--;
            seats[0] = 1;
            if(n == 0){
                return true;
            }
        }
        if(seats[m-1] == 0 && seats[m-2] == 0){
            n--;
            seats[m-1] = 1;
            if(n == 0){
                return true;
            }
        }
        for(int i=1; i<m-1; i++){
            if(seats[i-1] == 0 && seats[i] == 0 && seats[i+1] == 0){
                n--;
                seats[i] = 1;
                i++;
            }
            if(n == 0){
                return true;
            }
        }
        return false;
    }
}