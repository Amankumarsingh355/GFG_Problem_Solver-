class Solution {
    String solve(String N) {
       HashMap<Character, Integer> map = new HashMap<>();
       for (int i = 0; i < N.length(); i++) {
            map.put(N.charAt(i), map.getOrDefault(N.charAt(i), 0) + 1);
        }
        int max = 0;
        char ans = '0';
        for(char s : map.keySet()) {
            int frequency = map.get(s);
            if(frequency > max || (frequency == max && s > ans)) {
            max = frequency;
            ans = s;
            }
        }
         return String.valueOf(ans);
    }
}