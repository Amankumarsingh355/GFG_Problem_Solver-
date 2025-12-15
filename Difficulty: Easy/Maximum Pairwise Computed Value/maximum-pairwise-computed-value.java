class Solution {
    public int findMax(ArrayList<Height> arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;  i < arr.size(); i++){
            int ans1 = arr.get(i).feet * 12;
            int ans2 = arr.get(i).inches;
            int res = ans1 + ans2;
            max = Math.max(max , res);
        }
        return max;
    }
}