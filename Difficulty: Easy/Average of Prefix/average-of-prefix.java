class Solution {
    public ArrayList<Integer> prefixAvg(ArrayList<Integer> arr) {
        ArrayList<Integer>al=new ArrayList<>();
        int sum=0;
        for(int i=0;i<arr.size();i++)
        {
            sum+=arr.get(i);
            al.add(sum/(i+1));
        }
        return al;
    }
}