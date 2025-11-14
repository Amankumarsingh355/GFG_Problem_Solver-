class Solution {
    public long[] findElements(long arr[]) {
        long l=Integer.MIN_VALUE;
        long s=Integer.MIN_VALUE;
        for(long num:arr){
            if(num>l){
                s=l;
                l=num;
            }else if(num>s){
                s=num;
            }
        }
        List<Long>list=new ArrayList<>();
        for(long num:arr){
            if(num!=l && num!=s){
                list.add(num);
            }
        }
        Collections.sort(list);
        long []res=new long[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
            }
            return res;
    }
}