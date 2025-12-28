class Sol {
    long equalPairs(String s) {
        long count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i : map.values()){
            count += i*i;
        }
        return count;
    }
}