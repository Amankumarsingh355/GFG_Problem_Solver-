class Solution {
    public int wordLadderLength(String startWord, String targetWord, String[] wordList) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(wordList)); // Store words for quick lookup
        if (!wordSet.contains(targetWord)) return 0; // If target word is not in list, return 0
        Queue<String> queue = new LinkedList<>();
        queue.offer(startWord);
        int steps = 1; 
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                char[] wordArr = word.toCharArray();
                for (int j = 0; j < wordArr.length; j++) {
                    char originalChar = wordArr[j];

                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == originalChar) continue; 
                        wordArr[j] = c;
                        String newWord = new String(wordArr);

                        if (newWord.equals(targetWord)) return steps + 1; 
                        if (wordSet.contains(newWord)) {
                            queue.offer(newWord);
                            wordSet.remove(newWord); 
                        }
                    }
                    wordArr[j] = originalChar;
                }
            }
            steps++; 
        }

        return 0;
    }
}