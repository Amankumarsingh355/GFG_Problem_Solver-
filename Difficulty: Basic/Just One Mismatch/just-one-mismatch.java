class Solution {
    static String isStringExist(String arr[], int N, String S) {
        for(int i=0;i<arr.length;i++){
              String str=arr[i];
                int count=0;
              if(S.length()==str.length()){
                  for(int j=0;j<str.length();j++){
                      if(S.charAt(j)!=str.charAt(j)){
                         count++;
                      }
                  }
                 if(count==1){
                     return "True";
                 } 
              }
        }
       return "False";    
    }
}