class Solution {
    public ArrayList<Integer> findFibSubset(int arr[]) {
        int max=arr[0];
        for(int ele:arr){
            max=Math.max(max, ele);
        }
        int a=0;
        int b=1;
       int num=1;
        HashSet<Integer> present=new HashSet<>();
        present.add(0);
        while(num<max){
            num=a+b;
            a=b;
            b=num;
            present.add(num);
         }
        ArrayList<Integer> list=new ArrayList<>();
        for(int ele:arr){
            if(present.contains(ele)){
                list.add(ele);
            }
        }
        return list;
    }
}