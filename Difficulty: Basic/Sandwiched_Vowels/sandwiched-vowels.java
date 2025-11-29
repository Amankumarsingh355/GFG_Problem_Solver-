class Complete {
    static boolean isVowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
    public static String Sandwiched_Vowel(String str){
        StringBuilder sb = new StringBuilder();
        int n =str.length();
        for (int i=0;i<n;i++){
            char ch=str.charAt(i);
            if (isVowel(ch)&&i>0&&i<n-1&&!isVowel(str.charAt(i-1))&&!isVowel(str.charAt(i+1))){
                continue;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}