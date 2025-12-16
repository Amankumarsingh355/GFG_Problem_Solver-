class Solution
{
    static int find_height(int tree[], int n, int k)
    {
        int high = Arrays.stream(tree).max().getAsInt();
        int low = 0;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(findRemaining(mid, tree) == k) {
                return mid;
            } else if(findRemaining(mid, tree) > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    static int findRemaining(int cut, int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += (arr[i] - cut) < 0 ? 0 : (arr[i] - cut);
        }
        return sum;
    }
}