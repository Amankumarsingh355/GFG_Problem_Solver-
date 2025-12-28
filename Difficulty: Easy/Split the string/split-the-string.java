class Solution {
    static int isPossible(String S) {
        HashSet<String>set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            sb.append(ch);
            if(!set.contains(sb.toString())){
                set.add(sb.toString());
                sb.setLength(0);
            }
            if(set.size()>=4)
            {
                return 1;
            }
        }
        return 0;
    }
}