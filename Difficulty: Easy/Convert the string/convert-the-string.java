class Solution 
{ 
    String transform(String Str) 
    {
        ArrayList<Character>li=new ArrayList<>();
        li.add('a');
        li.add('e');
        li.add('i');
        li.add('o');
        li.add('u');
        li.add('A');
        li.add('E');
        li.add('I');
        li.add('O');
        li.add('U');
        String s="";
        for(char ch:Str.toCharArray()){
            if(!li.contains(ch)){
                s+='#';
                if(Character.isUpperCase(ch)) s+=Character.toLowerCase(ch);
                else s+=Character.toUpperCase(ch);
            }
        }
        return s==""?"-1":s;
    }
}