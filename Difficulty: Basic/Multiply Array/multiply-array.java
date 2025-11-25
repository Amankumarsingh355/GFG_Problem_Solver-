class Solution {
    public static int product(int arr[], int n) {
        int num = 1;
        for(int i =0; i < n; i++){
            num = num*arr[i];
        }
        return num;
    }
}

