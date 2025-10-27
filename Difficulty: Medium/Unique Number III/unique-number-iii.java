class Solution {
    public int getSingle(int[] arr) {

        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i< arr.length;i++){

            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        int val = 0;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 1) {
                val = entry.getKey();
                break;
            }
        }

        return val;
    }
}

