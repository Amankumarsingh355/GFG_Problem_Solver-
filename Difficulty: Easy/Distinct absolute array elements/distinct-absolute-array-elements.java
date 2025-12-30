class Solution {
    public int distinctCount(int[] arr) {
        int n = arr.length;
        if (n == 1)
          return 1;
        for (int i = 0; i < arr.length; i++) {
          arr[i] = Math.abs(arr[i]);
        }
        Arrays.sort(arr);
        int i = 1, prev = arr[0], count = n;
        while (i < arr.length) {
          if (prev == arr[i]) {
            while (i < arr.length && prev == arr[i]) {
              i++;
              count--;
            }
            if (i < n){
              prev = arr[i];count++;}
          } else {
            prev = arr[i];
            i++;
          }
        }
        return count;
    }
}