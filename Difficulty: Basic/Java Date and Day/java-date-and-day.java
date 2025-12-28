class Solution{
    static String findDay(int Day, int Month, int Year){
        Calendar cal = Calendar.getInstance();
        cal.set(Year,Month-1,Day);
        int val = cal.get(Calendar.DAY_OF_WEEK);
        String day = "";
        switch(val){
            case 1: 
                day = "SUNDAY";
                break;
            case 2: 
                day = "MONDAY";
                break;
            case 3: 
                day = "TUESDAY";
                break;
            case 4: 
                day = "WEDNESDAY";
                break;
            case 5:
                day = "THURSDAY";
                break;
            case 6:
                day = "FRIDAY";
                break;
            case 7:
                day = "SATURDAY";
                break;
        }
    return day;
    }
}