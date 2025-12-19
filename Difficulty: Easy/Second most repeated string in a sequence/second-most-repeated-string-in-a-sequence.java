class Solution {
    String secFrequent(String arr[], int N) {
        HashMap<String,Integer>h1=new HashMap<>();
        for(String ele:arr)
        {
            h1.put(ele,h1.getOrDefault(ele,0)+1);
        }
        int fval=Integer.MIN_VALUE;
        int sval=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer>e1:h1.entrySet())
        {
            if(e1.getValue()>fval)
            {
                sval=fval;
                fval=e1.getValue();
            }
            else if(e1.getValue()>sval && e1.getValue()<fval)
            {
                sval=e1.getValue();
            }
        }
        for(Map.Entry<String,Integer>e2:h1.entrySet())
        {
            if(e2.getValue()==sval)
            {
                return e2.getKey();
            }
        }
        return "";
    }
}