class Solution 
{ 
    boolean isEven(String s,int n) 
    { 
        int val=0;
        for(int v=n-1;v>=0;v--){
            if(s.charAt(v)!='0'&&s.charAt(v)!='.'){
                val=s.charAt(v)-'0';
                break;
            }
        }
        if(val%2==0){
            return true;
        }else{
            return false;
        }
    }
}