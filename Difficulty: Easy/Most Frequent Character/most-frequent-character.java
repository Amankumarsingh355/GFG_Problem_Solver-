class Solution {
    public char getMaxOccuringChar(String s) {
        int n = s.length();
         int maxfreq = -1;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i=0, j=0;
        while(j<n ){
            if(arr[i] == arr[j]) {
                j++;
            }
            else{
                int freq = j-i;
                if(freq > maxfreq) 
                {
                    maxfreq = freq;
                    ans = arr[i];
                }
                i = j;
                
            }
        }
        int freq = j-i;
                if(freq > maxfreq) 
                {
                    maxfreq = freq;
                    ans = arr[i];
                }
                
        return ans;   
    }
}