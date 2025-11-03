class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (k == arr.get(i)) {
                return i+1;}
        
    }
    return -1;
    }
}