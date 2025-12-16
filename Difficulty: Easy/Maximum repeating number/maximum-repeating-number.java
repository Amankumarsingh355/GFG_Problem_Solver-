class Solution {
    int maxRepeating(int k, int[] arr) {
        int a[]=new int[k];
        for(int i:arr){
            a[i]++;
        }
        int max=0;
        for(int j:a){
            max=Math.max(j,max);
        }
        for(int x=0;x<a.length;x++){
            if(a[x]==max)
                return x;
        }
        return 0;
    }
}