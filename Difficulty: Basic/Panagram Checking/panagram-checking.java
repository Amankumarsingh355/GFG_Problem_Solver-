class Solution 
{
    public static boolean isPanagram(String str)
    {
        Set<Character> set = new HashSet<>();
        str = str.toLowerCase();
        for (char c : str.toCharArray()) 
        {
            if (c >= 'a' && c <= 'z') 
            {
                set.add(c);
            }
        }
        return set.size() == 26;
    }
}