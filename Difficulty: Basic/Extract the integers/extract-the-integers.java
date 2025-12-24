class Solution {
    ArrayList<String> extractIntegerWords(String s) 
    { 
        ArrayList<String> list = new ArrayList<>();
        char[]c = s.toCharArray();
        for(int i=0; i<c.length; i++){
            StringBuilder res = new StringBuilder();
               if('0'<=c[i]&&c[i]<='9'){
                   while(i<c.length&&'0'<=c[i]&&c[i]<='9'){
                        res.append(c[i]);
                        i++;
                    }
                    list.add(res.toString());
               }
        }
        return list;
    }
}