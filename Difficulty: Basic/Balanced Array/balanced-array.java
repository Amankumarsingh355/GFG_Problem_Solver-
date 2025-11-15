class Solution {
    public int minValueToBalance(List<Integer> arr) {
        int sum=0;
        int n=0;
        int sum2=0;
        int a=arr.size()/2;
        for(int i=0;i<a;i++){
        sum+=arr.get(i);
    }
    for(int i=a;i<arr.size();i++){
        sum2+=arr.get(i);
    }
    n=Math.abs(sum-sum2);
        return n;
    }
}