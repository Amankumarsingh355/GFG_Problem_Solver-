class Solution 
{ 
    String isGoodString(String s) 
    { 
        for(int v=1;v<s.length();v++){
            if(s.charAt(v)==s.charAt(v-1)){
                return "NO";
            }
        }
        return "YES";
    }
} 