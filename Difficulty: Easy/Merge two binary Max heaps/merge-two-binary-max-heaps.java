class Solution{
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
      int i=0;
      int j=0;
      int idx=0;
      int arr[]=new int[m+n];
      while(i<a.length && j<b.length){
          if(a[i]>b[j]){
              arr[idx]=a[i];
              i++;
          }
          else{
              arr[idx]=b[j];
              j++;
          }
          idx++;
      }
      while(i<a.length){
          arr[idx]=a[i];
          i++;
          idx++;
      }
      while(j<b.length){
          arr[idx]=b[j];
          j++;
          idx++;
      }
      return arr;
    }
}