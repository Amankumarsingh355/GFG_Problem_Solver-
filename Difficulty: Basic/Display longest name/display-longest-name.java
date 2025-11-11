class Solution {
    public String longest(List<String> arr) {
        int largest = 0;
        int largest_len = arr.get(0).length();
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).length() > largest_len) {
                largest_len = arr.get(i).length();
                largest = i;
            }
        }
        return arr.get(largest);
    }
}