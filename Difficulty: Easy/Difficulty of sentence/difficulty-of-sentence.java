class Solution {
    static boolean checkVowel(char ch) {
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }
    static int calcConsonants(String s) {
        int c=0;
        for(int i=0;i<s.length();i++) {
            if(!checkVowel(s.charAt(i)))
                c++;
        }
        return c;
    }
    public int calcDiff(String s) {
        int hard=0,easy=0;
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++) {
            int cons=calcConsonants(arr[i]);
            String word=arr[i];
            int vowels=word.length()-cons;
            boolean hardword=false;
            if(cons>vowels)
                hardword=true;
            int consecutive=0;
            for(int j=0;j<word.length();j++) {
                if(!checkVowel(word.charAt(j))) {
                    consecutive++;
                    if(consecutive>=4) {
                        hardword=true;
                        break;
                    }
                }else 
                    consecutive=0;
            }
            if(hardword)
                hard++;
            else
                easy++;
        }
        return 5*hard+3*easy;
    }
}