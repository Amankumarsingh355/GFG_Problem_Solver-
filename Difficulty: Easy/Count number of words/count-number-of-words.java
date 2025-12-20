class Solution {
    int countWords(String s) {
        int c=0;
        s=s.replace("\\t"," ");
        s=s.replace("\\n"," ");
        String[] arr =s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>=1){
                c++;
            }
        }
        return c;
    }
}