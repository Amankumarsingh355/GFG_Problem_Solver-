class Solution {
    long ExtractNumber(String sentence) {
class Solution {
    long ExtractNumber(String sentence) {
        // code here
        String []a=sentence.split(" ");
        long max=-1;
        for(String b:a){
            if(b.matches("\\d+")){
                if(!b.contains("9")){
                    long num=Long.parseLong(b);
                    if(num>max){
                        max=num;
                    }
                }
            }
        }
        return max;
        
    }
}        String []a=sentence.split(" ");
        long max=-1;
        for(String b:a){
            if(b.matches("\\d+")){
                if(!b.contains("9")){
                    long num=Long.parseLong(b);
                    if(num>max){
                        max=num;
                    }
                }
            }
        }
        return max;
        
    }
}