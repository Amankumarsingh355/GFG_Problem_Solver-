class Solution {
    int search(String pat, String txt) {
        HashMap<Character,Integer>pattern = new HashMap<>();
        HashMap<Character,Integer>running = new HashMap<>();
        int k = pat.length();
        for(int i = 0 ; i < pat.length();i++)
        {
            char ch = pat.charAt(i);
            pattern.put(ch,pattern.getOrDefault(ch,0)+1);
        }
        for(int i = 0 ; i < k;i++)
        {
            char ch = txt.charAt(i);
            running.put(ch,running.getOrDefault(ch,0)+1);
        }
        int count =0;
        if(running.equals(pattern))count++;
        for(int i = k ; i < txt.length();i++)
        {
            char toRem = txt.charAt(i-k);
            char toAdd = txt.charAt(i);
            int freq = running.get(toRem);
            if(freq==1){
                running.remove(toRem);
            }else{
                running.put(toRem,freq-1);
            }
            running.put(toAdd,running.getOrDefault(toAdd,0)+1);
            
            if(running.equals(pattern))count++;
        }
        return count;
    }
}