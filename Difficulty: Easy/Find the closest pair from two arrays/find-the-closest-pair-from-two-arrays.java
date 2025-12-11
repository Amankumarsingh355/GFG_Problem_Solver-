class Solution{
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        int dim = 0;int dip = brr.length - 1;
        int result[] = new int[2];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int analyser = Integer.MAX_VALUE;
        while(dim < arr.length && dip >= 0 )
        {
            int sum = arr[dim] + brr[dip];
            if(Math.abs(sum - x) < analyser )
            {
                analyser = Math.abs(sum - x);
                result[0] = arr[dim];
                result[1] = brr[dip];
            }
            if(sum <= x)
            {
                dim++;
            }
            else
            {
                dip--;
            }
        }
        list.add(result[0]);list.add(result[1]);
        return list;
    }
}