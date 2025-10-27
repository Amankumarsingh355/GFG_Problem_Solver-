class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> list = new ArrayList<>();
        int rem = 1;
        for(int i=N-1; i>=0; i--) {
            int curr = arr.get(i);
            
            if(curr == 9 && rem == 1) {
                list.add(0, 0);
                rem = 1;
            } else {
                list.add(0, curr + rem);
                rem = 0;
            }
        }
        if(rem == 1) list.add(0, 1);
        return list;
    }
};