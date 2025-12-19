class Solution {
    public String convert(String s) {
        String [] arr= s.split(" ");
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            str=str.substring(0,1).toUpperCase()+str.substring(1);
            arr[i]=str;
        }
        StringBuilder sb = new StringBuilder();
         for(int i=0;i<arr.length;i++){
             sb.append(arr[i]+" ");
         }
         return sb.toString().trim();
    }
}