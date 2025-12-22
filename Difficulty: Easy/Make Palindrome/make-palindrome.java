class Solution {
    public static boolean makePalindrome(int n, String[] arr) {
        HashSet<String> set = new HashSet<>();
        for(int i = 0;i < arr.length;i++)
        {
            StringBuilder sb = new StringBuilder();
            String rev = sb.append(arr[i]).reverse().toString();
            if(set.contains(rev))
            {
                set.remove(rev);
            }else
            {
                set.add(arr[i]);
            }
            sb.setLength(0); 
            rev = null;
        }
        if(set.size() == 0) return true;
        if(set.size() > 1)  return false;
         String rahee = "";
         for(String d : set )
         {
             rahee = d;
             }
             int i =0;
             while(i < rahee.length())
             {
                 if(rahee.charAt(i) != rahee.charAt(rahee.length() - 1 -i))
                  return false;
                  i++;
             }
             return true;
    }
}