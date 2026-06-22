class Solution {
    int maxPeopleDefeated(int p) {
        // code here
        int low = 1;
        int cnt = 0;
        int high = (int)Math.sqrt(p);
        for(int i = low; i <= high; i++){
            int x = i * i;
            if(x <= p){
                p -= x;
                cnt++;
            }
        }
        return cnt;
    }
};