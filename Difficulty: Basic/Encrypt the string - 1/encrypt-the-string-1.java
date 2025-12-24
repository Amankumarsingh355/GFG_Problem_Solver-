class Solution 
{ 
    String encryptString(String s) 
    {
        StringBuilder str=new StringBuilder();
        int arr[]=new int[26];
        HashSet<Character>set=new HashSet<>();
        for(int i=s.length()-1;i>=0;){
            char ch=s.charAt(i);
            int idx=i-1;
            int cnt=1;
            while(idx>=0&&s.charAt(idx)==ch){
                idx--;
                cnt++;
            }
            i=idx;
            StringBuilder temp=new StringBuilder();
            temp.append(cnt+"");
            temp.reverse();
            str.append(temp);
            str.append(ch);
        }
        return str.toString();
    }
} 