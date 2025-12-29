class Solution {
    public int count(int coins[], int sum) {
        int n = coins.length;
        int prev[] = new int[sum + 1];
        prev[0] = 1;
        for(int s=1;s<=sum;s++){
            if(s % coins[0] == 0)
            prev[s] = 1;
        }
        for(int i=1;i<n;i++){
            int curr[] = new int[sum + 1];
            prev[0] = 1;
            for(int s=0;s<=sum;s++){
                int pick = 0;
                if(s >= coins[i]){
                    pick = curr[s - coins[i]];
                }
                int notPick = prev[s];
                curr[s] = pick + notPick;
            }
            prev = curr;
        }
        return prev[sum];
}
}