class Solution {
    public static long totalTime(int n,int arr[],int p[])
    {
        HashSet<Integer>set  = new HashSet<>();
        set.add(arr[0]);
        int t = 0;
        for(int i=1; i<n; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                t++;
            }else{
                t+=p[arr[i]-1];
                
            }
        }
        return t;
        
    }
}