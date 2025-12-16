class Solution {
    static boolean canAttend(int[][] arr) {
        Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i+1][0]<arr[i][1])
            {
                return false;
            }
        }
        return true;
    }
}