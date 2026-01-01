class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        int arr[]=new int[Mat.length*Mat.length];
        int k=0;
        for(int i=0;i<Mat.length;i++){
            for(int j=0;j<Mat[0].length;j++){
                arr[k++]=Mat[i][j];
            }
        }
        Arrays.sort(arr);
        int l=0;
        for(int i=0;i<Mat.length;i++){
            for(int j=0;j<Mat[0].length;j++){
                Mat[i][j]=arr[l++];
            }
        }
        return Mat;
    }
}