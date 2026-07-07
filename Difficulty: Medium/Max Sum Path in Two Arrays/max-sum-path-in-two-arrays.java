class Solution {
    public int maxPathSum(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int prefix_sum_a = 0;
        int prefix_sum_b = 0;
        int i = 0;
        int j = 0;
        int maxSum = 0;
        while(i < n1 && j < n2){
            if(a[i] == b[j]){
                maxSum += a[i] + Math.max(prefix_sum_a , prefix_sum_b);
                prefix_sum_a = 0;
                prefix_sum_b = 0;
                i++;
                j++;
            }else{
                if(a[i] < b[j]){
                    prefix_sum_a += a[i];
                    i++;
                }else{
                    prefix_sum_b += b[j];
                    j++;
                }
            }
        }
        while(i < n1){
            prefix_sum_a += a[i];
            i++;
        }
        while(j < n2){
            prefix_sum_b += b[j];
            j++;
        }
        maxSum += Math.max(prefix_sum_a , prefix_sum_b);
        return maxSum;
    }
}