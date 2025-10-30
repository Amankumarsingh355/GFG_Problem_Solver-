class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int j : b) {
            freq.put(j, freq.getOrDefault(j, 0) + 1);
        }
        for (int j : a) {
            if (freq.containsKey(j)) freq.put(j, freq.get(j) - 1);
        }
        for(int j : freq.values()) if(j > 0) return false;
        return true;
    }
}