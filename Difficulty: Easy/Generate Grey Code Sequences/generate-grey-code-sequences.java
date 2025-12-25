class Solution
{
    ArrayList <String> generateCode(int n)
    {
        ArrayList<String>ans = new ArrayList<>();
        String curr = "";
        for(int i = 0;i < n;i++){
            curr += '0';
        }
        ans.add(curr);
        int i = 0;
        while(i<n){
            for(int j = ans.size()-1;j >= 0;j--){
                 String grayCode = generate(ans.get(j),n-1-i);
                 ans.add(grayCode);
            }
            i++;
        }
        return ans;
    }
    String generate(String temp,int idx){
        String grayCode = temp.substring(0,idx)+'1'+temp.substring(idx+1);
        return grayCode;
    }
}