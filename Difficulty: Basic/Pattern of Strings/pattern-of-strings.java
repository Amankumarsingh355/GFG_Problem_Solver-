class Solution {
    ArrayList<String> pattern(String s) {
        ArrayList<String> result = new ArrayList<String>();
        for(int i = s.length() - 1; i >= 0; i--){
            int j = 0;
            StringBuilder sb = new StringBuilder();
            while(j <= i){
                sb.append(s.charAt(j));
                j++;
            }
        result.add(sb.toString());    
        }
    return result;
    }
};