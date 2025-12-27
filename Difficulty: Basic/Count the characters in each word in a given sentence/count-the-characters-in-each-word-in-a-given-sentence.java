class Solution {
    ArrayList<Integer> countChars(String s) {
        ArrayList<Integer> lengths = new ArrayList<>();
        String[] words = s.split("\\s+");
        for (String word : words) {
            lengths.add(word.length());
        }
        return lengths;
    }
}