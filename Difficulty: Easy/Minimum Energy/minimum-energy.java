class Solution {
    public int minEnergy(int a[]) {
        int count = 1, sum = 0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
            if(sum<0){
                count+=Math.abs(sum);
                sum = 0;
            }
        }
        return count;
    }
}