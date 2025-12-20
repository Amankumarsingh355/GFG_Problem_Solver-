class Solution {
    String merge(String S1, String S2) {
        int index=0;
       StringBuilder builder=new StringBuilder();
         if (S1.length() == 0) {
            builder.append(S2);
            return builder.toString();
        }
        if (S2.length() == 0) {
            builder.append(S1);
            return builder.toString();
        }
        for(int i=0;i<Math.max(S1.length(),S2.length());i++){
            if(index<S1.length()){
                builder.append(S1.charAt(index));
            }
            if(index<S2.length()){
                builder.append(S2.charAt(index));
            }
            index++;
        }
        return builder.toString();
    }
}