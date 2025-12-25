class Solution {
    public String solve(String s) {
        String vow="aeiou";
        int c=0;
        HashSet<Character> hm=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(!hm.contains(s.charAt(i))){
                hm.add(s.charAt(i));
                if(vow.indexOf(s.charAt(i))==-1)
                    c++;
            }
        }
        return c%2==0?"SHE!":"HE!";
    }
}