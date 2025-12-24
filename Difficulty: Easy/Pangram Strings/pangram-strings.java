class Solution {
    int isPanagram(String S) {
        Set<Character> set = new HashSet<>();
        S = S.toLowerCase();
        for (char c : S.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }
        if (set.size() == 26) 
        {
            return 1;  
        } 
        else 
        {
            return 0; 
        }
    }
};