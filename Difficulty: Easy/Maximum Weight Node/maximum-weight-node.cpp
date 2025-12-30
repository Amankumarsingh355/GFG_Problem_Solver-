class Solution {
  public:
    int maxWeightCell(vector<int> &exits) {
        int n = exits.size();
        vector<int> res(n, 0);
        for(int i = 0;i<n;i++){
            if(exits[i] == -1)continue;
            res[exits[i]]+=i;
        }
        int maxnum = -1;
        int idx = -1;
        for(int i = 0;i<n;i++){
            if(res[i]>=maxnum){
                maxnum = res[i];
                idx = i;
            }
        }
        return idx;
    }
};