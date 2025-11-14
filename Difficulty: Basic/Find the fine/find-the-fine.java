class Solution {
    public long totalFine(int date, int car[], int fine[]) {
        int num = 0;
        if(date % 2 == 0) num = 1;
        long fines = 0;
        for(int i = 0; i<car.length;i++){
            if(car[i] % 2 == num) fines += fine[i];
        }
        return fines;
    }
}