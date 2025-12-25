class Solution{
    public String amendSentence(String s){
        StringBuilder ans=new StringBuilder();
         char z=Character.toLowerCase(s.charAt(0));
           ans.append(z);
        for(int i=1;i<s.length();i++){
           if(Character.isUpperCase(s.charAt(i))){
               ans.append(" ");
               char a=Character.toLowerCase(s.charAt(i));
               ans.append(a);
           }
           else
           ans.append(s.charAt(i));
           
        }
        return ans.toString();
    }
}