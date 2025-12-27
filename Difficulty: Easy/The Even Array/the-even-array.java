class Solution {
    public int convertToEven(String s)
    {
        int count = 0, n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='O'){
                while(i<n&&s.charAt(i)=='O'){
                    i++;
                }
                count++;
            }
        }
        return count;
    }
}