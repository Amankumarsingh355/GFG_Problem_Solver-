class Solution {
    static ArrayList<Integer> getStar(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(arr[i]);
                list.add(arr[i]);
            }
            else if(st.peek()<arr[i]){
                st.push(arr[i]);
                list.add(arr[i]);
            }
        }
         Collections.reverse(list);
         return list;
    }
}