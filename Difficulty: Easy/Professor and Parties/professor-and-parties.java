class Solution 
{
    public static String PartyType(int arr[]) 
    {
        HashSet<Integer> set = new HashSet<>();
        for (int color : arr) 
        {
            if (set.contains(color)) 
            {
                return "true";  
            }
            set.add(color);
        }
        return "false"; 
    }
}