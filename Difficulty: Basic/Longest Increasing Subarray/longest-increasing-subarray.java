class Solution {
    public int lenOfLongIncSubArr(List<Integer> arr) {
        int output = 1;
        int curLen = 1;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i-1) < arr.get(i)){
                curLen++;
                output = Math.max(curLen, output);
            }
            else{
                curLen = 1;
            }
        }
        return output;
    }
}