class Solution {
    public int minSteps(int m, int n, int d) {
        if (d > Math.max(m, n)) return -1;
        if (d % gcd(m, n) != 0) return -1;
        return Math.min(pour(m, n, d), pour(n, m, d));
    }
    private int pour(int fromCap, int toCap, int d) {
        int from = fromCap; 
        int to = 0;       
        int step = 1;   
        while (from != d && to != d) {
            int transfer = Math.min(from, toCap - to);
            to += transfer;
            from -= transfer;
            step++;
            // Check if we got d
            if (from == d || to == d)
                break;
            // If from jug becomes empty, fill it
            if (from == 0) {
                from = fromCap;
                step++;
            }
            // If to jug becomes full, empty it
            if (to == toCap) {
                to = 0;
                step++;
            }
        }
        return step;
    }
    // Function to compute gcd
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}