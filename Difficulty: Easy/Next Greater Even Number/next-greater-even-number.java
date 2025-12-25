class Solution
{
    public long getNextEven(String x)
    {
        int n = x.length();
        while (true)
        {
            int id = -1;
            for (int i = n - 2; i >= 0; i--)
            {
                if (x.charAt(i) < x.charAt(i + 1))
                {
                    id = i;
                    break;
                }
            }
            if (id == -1) return -1;
            
            int in = n - 1;
            for (int i = n - 1; i > id; i--) 
            {
                if (x.charAt(i) > x.charAt(id))
                {
                    in = i;
                    break;
                }
            }
            char[] a = x.toCharArray();
            char t = a[id]; a[id] = a[in]; a[in] = t;
            Arrays.sort(a, id + 1, n);
            x = String.valueOf(a);
            if ((a[n - 1] - '0') % 2 == 0) return Long.parseLong(x);
        }
    }
}