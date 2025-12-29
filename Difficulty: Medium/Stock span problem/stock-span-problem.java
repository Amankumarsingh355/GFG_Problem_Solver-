class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer>span=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        span.add(1);
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                span.add(i+1);
            }else{
                span.add(i-st.peek());
            }
            st.push(i);
        }
        return span;
    }
}