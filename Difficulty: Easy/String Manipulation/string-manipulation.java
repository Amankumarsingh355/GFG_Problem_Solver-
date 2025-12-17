class Solution {
    static int removeConsecutiveSame(String[] arr) {
        Stack<String> s = new Stack<>();
        for(String i : arr){
            if(s.isEmpty()){
                s.push(i);
            }
            else{
                if(i.equals(s.peek())){
                    s.pop();
                }else{
                    s.push(i);
                }
            }
        }
        return s.size();
    }
}