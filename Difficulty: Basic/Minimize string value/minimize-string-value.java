class Solution {
      int minValue(String S,int K) {
        if(S.length()<K){
            return 0;
        }
        int[]num = new int[26];
        for(int i=0; i<S.length(); i++){
            num[S.charAt(i)-'a']++;
        }
        Arrays.sort(num);
        while(K>0){
            num[25]--;
            Arrays.sort(num);
            K--;
        }
        int res = 0;
        for(int i=0; i<26; i++){
            res+=(num[i]*num[i]);
        }
        return res;
    }
}