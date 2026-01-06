class Solution {
    int longestSubarrayDivK(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,maxLen=0;
        for(int i=0;i<arr.length;i++){
            sum=(sum+arr[i])%k;
            if(sum<0){
                sum+=k;
            }
            if(sum==0){
                maxLen=i+1;
            }
            else if(map.containsKey(sum)){
                maxLen=
                Integer.max(maxLen,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}