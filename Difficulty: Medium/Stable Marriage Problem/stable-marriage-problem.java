import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {

    /**
     * Gale–Shapley men-proposing stable matching.
     * Signature matches typical GFG harness: stableMarriage(men, women)
     *
     * @param men   men[m] is an array of women indices in preference order
     * @param women women[w] is an array of men indices in preference order
     * @return int[] result where result[m] is the woman matched to man m
     */
    public int[] stableMarriage(int[][] men, int[][] women) {
        int n = men.length;
        // rank[w][m] = position of man m in woman w's preference list (lower is better)
        int[][] rank = new int[n][n];
        for (int w = 0; w < n; w++) {
            for (int pos = 0; pos < n; pos++) {
                rank[w][women[w][pos]] = pos;
            }
        }

        int[] nextProposal = new int[n];        // nextProposal[m] is index into men[m]
        int[] womanPartner = new int[n];        // womanPartner[w] = man or -1
        int[] manPartner = new int[n];          // manPartner[m] = woman or -1
        Arrays.fill(womanPartner, -1);
        Arrays.fill(manPartner, -1);

        Deque<Integer> freeMen = new ArrayDeque<>();
        for (int m = 0; m < n; m++) freeMen.addLast(m);

        while (!freeMen.isEmpty()) {
            int m = freeMen.removeFirst();
            int w = men[m][nextProposal[m]++];
            int current = womanPartner[w];

            if (current == -1) {
                womanPartner[w] = m;
                manPartner[m] = w;
            } else {
                if (rank[w][m] < rank[w][current]) {
                    // woman prefers new proposer
                    womanPartner[w] = m;
                    manPartner[m] = w;
                    manPartner[current] = -1;
                    freeMen.addLast(current);
                } else {
                    // woman rejects m; if m still has women left, put him back
                    if (nextProposal[m] < n) freeMen.addLast(m);
                }
            }
        }

        return manPartner;
    }

    // Optional local test
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] men1 = {{0,1},{0,1}};
        int[][] women1 = {{0,1},{0,1}};
        System.out.println(Arrays.toString(sol.stableMarriage(men1, women1))); // [0, 1]

        int[][] men2 = {{0,1,2},{0,1,2},{0,1,2}};
        int[][] women2 = {{2,1,0},{2,1,0},{2,1,0}};
        System.out.println(Arrays.toString(sol.stableMarriage(men2, women2))); // [2, 1, 0]
    }
}