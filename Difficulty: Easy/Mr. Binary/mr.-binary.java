class Solution {
    public int maximum_index(String s)
    {
        char temp=s.charAt(0);
        int res=s.lastIndexOf(temp);
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==temp+1){
                temp=s.charAt(i);
                int index=s.lastIndexOf(temp);
                if(index>res)
                    res=index;
            }
        }
        return res;
    }
}
