class Solution {
    public static String[] winner(String arr[], int n) {
        TreeMap<String,Integer> tm=new TreeMap<>();
        for(int i=0;i<n;i++)
        {
            String name=arr[i];
            if(tm.containsKey(name))
            {
                tm.put(name,tm.get(name)+1);
            }
            else
            {
                tm.put(name,1);
            }
        }
        String winner="";
        int maxVotes=0;
        for(Map.Entry<String,Integer> e: tm.entrySet())
        {
            String name=e.getKey();
            int votes=e.getValue();
            if(votes>maxVotes){
                maxVotes=votes;
                winner=name;
            }
        }
        return new String[]{winner,String.valueOf(maxVotes)};
    }
}