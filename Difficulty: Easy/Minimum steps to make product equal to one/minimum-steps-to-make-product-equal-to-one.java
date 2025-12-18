class Solution {
    static int makeProductOne(int[] arr, int N) {
        int steps = 0;
        int negCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < N; i++) {
            int x = arr[i];
            if (x == 1) {
                continue;
            }
            if (x > 1) {
                steps += (x - 1);
            } 
            else if (x == 0) {
                zeroCount++;
                steps += 1;
            } 
            else { 
                negCount++;
                if (x == -1) {
                    continue;
                } else {
                    steps += (-1 - x);
                }
            }
        }
        if ((negCount % 2) == 1 && zeroCount == 0) {
            steps += 2;
        }
        return steps;
    }
}