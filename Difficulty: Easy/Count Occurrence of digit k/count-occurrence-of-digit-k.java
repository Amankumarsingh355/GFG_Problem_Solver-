class Solution {
    public int num(int k, int arr[]) {
        int count = 0;
        int s = arr.length;
        for(int i=0;i<s;i++){
            int a = arr[i];
            while(a != 0){
                int b = a%10;
                if(b == k){
                    count++;
                }
                a = a/10;
            }
        }
        return count;
    }
}