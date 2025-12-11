class Solution {
    public static long maximizeSum(long a[], int n, int k)
    {
        Arrays.sort(a);
        long sum =0 ;
        long smallestnumber=  Integer. MAX_VALUE;
        for(int i =0;i<a.length;i++){
            if(k>0 && a[i]<0 ){
                a[i] = -a[i];
                k--;
            }
                sum+=a[i];
            smallestnumber= Math.min(smallestnumber,Math.abs(a[i]));
            
        }
          if (k > 0 && k % 2 == 1) {
            sum -= 2 * smallestnumber;
        }
        return sum;
    }
}

