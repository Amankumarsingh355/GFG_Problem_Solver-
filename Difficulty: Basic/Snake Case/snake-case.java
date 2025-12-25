class Solution {
    static String snakeCase(String S, int n) {
     S=S.toLowerCase(); 
     char[] arr=S.toCharArray();
    for(int i=0;i<arr.length;i++){
        if(arr[i]==' '){
           arr[i]='_';
        }
    }
        return String.valueOf(arr);
    }
}