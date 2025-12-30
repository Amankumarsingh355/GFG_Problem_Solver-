class Solution {
    public void sortedMerge(int[] arr1, int[] arr2, int[] res) {
        int n1=arr1.length;
        int n2=arr2.length;
        for(int i=0;i<n1;i++){
            res[i]=arr1[i];
        }
        for(int j=0;j<n2;j++){
            res[n1+j]=arr2[j];
        }
        Arrays.sort(res);
    }
}