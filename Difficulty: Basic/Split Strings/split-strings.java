class Solution {
    static List<String> splitString(String S) {
        StringBuilder S1 = new StringBuilder(); 
        StringBuilder S2 = new StringBuilder(); 
        StringBuilder S3 = new StringBuilder();
        for(char ch : S.toCharArray()){
            if(Character.isLetter(ch)){
                S1.append(ch);
            } 
            else if(Character.isDigit(ch)){
                S2.append(ch);
            } 
            else{
                S3.append(ch);
            }
        }
        List<String> result = new ArrayList<>();
        result.add(S1.length() > 0 ? S1.toString() : "-1");
        result.add(S2.length() > 0 ? S2.toString() : "-1");
        result.add(S3.length() > 0 ? S3.toString() : "-1");
        return result;
    }
}