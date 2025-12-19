class Solution {
    String removeDups(String s) {
       LinkedHashSet<Character> linked = new LinkedHashSet<>();
       for(int i=0; i<s.length(); i++)
       {
           linked.add(s.charAt(i));
       }
       StringBuilder builder = new StringBuilder();
       for(char c: linked)
       {
           builder.append(c);
       }
       String result = builder.toString();
       return result;
    }
}