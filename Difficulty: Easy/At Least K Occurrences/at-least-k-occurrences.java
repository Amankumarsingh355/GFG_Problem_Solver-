class Solution {
    public int firstElementKTime(int[] arr, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int x : arr)
        {
            hm.put(x,hm.getOrDefault(x,0)+1);
            if(hm.get(x)==k)
             return x;
        }
        return -1;
    }
}