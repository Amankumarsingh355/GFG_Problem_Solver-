class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<pair> answerList = new ArrayList<>();
        for(int i=0; i<arr2.length; i++)
            map.put(arr2[i],map.getOrDefault(arr2[i],0) + 1);
        Arrays.sort(arr1);
        int index = 0;
        for(int i=0; i<arr1.length; i++){
            int val = target - arr1[i];
            if(map.containsKey(val)){
                int count = map.get(val);
                while(count != 0){
                    answerList.add(new pair(arr1[i],val));
                    count--;
                }
            }
        }
        pair[] answerArray = new pair[answerList.size()];
        for(int i=0; i<answerArray.length; i++){
            answerArray[i] = answerList.get(i);
        }
        return answerArray;
    }
}