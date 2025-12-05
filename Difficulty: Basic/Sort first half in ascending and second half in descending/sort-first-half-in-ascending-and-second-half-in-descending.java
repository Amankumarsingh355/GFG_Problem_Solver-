class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        int n= arr.length / 2;
        Arrays.sort(arr, 0, n); 
        Integer[] seHa = new Integer[ n];
        for (int i = n; i < arr.length; i++)
        {
            seHa[i - n] = arr[i];
        }
        Arrays.sort(seHa, Collections.reverseOrder()); 
        for (int i = n; i < arr.length; i++)
        {
            arr[i] = seHa[i -n];
        }
        ArrayList<Integer> result = new ArrayList<>();
       for (int i = 0; i < arr.length; i++)
       {
          int num = arr[i];
          result.add(num);
        }

        return result; 
    }
}