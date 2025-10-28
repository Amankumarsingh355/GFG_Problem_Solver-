
class Solution {
     public static ArrayList<Integer> countBits(int n) {
        ArrayList<Integer> ans =new ArrayList<Integer>();
        for(int i=0;i<=n;i++)
        {
            int temp=i;
            int count=0;
            while(temp!=0)
            {
                temp=temp&(temp-1);
                count++;
            }
            ans.add(count);
        }
        
        return ans;
        
    }
}