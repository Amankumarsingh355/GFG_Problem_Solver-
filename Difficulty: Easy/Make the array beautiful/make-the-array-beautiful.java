class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
         if(arr.length==0)  return list; 
        if(arr.length==1){
            list.add(arr[0]);
            return list;
        }
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()) st.push(arr[i]);
          else if(arr[i]<0 && st.peek()<0 || arr[i]>=0 && st.peek()>=0  ){
                st.push(arr[i]);
            }
            else {
                st.pop();
            }
        }
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        Collections.reverse(list);
        return list;
    }
}