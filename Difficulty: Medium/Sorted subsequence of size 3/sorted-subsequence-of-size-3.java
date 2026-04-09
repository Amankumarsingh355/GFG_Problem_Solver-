class Solution {
    public ArrayList<Integer> find3Numbers(int[] arr) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        int n=arr.length;
        int[] smaller=new int[n];
        Arrays.fill(smaller,-1);
        int min=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[min])
            {
                min=i;
            }
            else
            {
                smaller[i]=min;
            }
        }
        int[] greater = new int[n];
        Arrays.fill(greater, -1);
        int max = n - 1;
        for (int i = n - 2; i >= 0; i--)
        {
            if (arr[i] >= arr[max])
                max = i;
            else
                greater[i] = max;
        }
        for (int i = 0; i < n; i++)
        {
            if (smaller[i] != -1 && greater[i] != -1){
            res.add(arr[smaller[i]]);
            res.add(arr[i]);
            res.add(arr[greater[i]]);
                return res;
            }
        }
        return res;
    }
}